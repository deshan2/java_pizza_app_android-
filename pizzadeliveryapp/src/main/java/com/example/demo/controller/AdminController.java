
package com.example.demo.controller;

import com.example.demo.model.Delivery;
import com.example.demo.model.DeliveryRider;
import com.example.demo.service.DeliveryRiderService;
import com.example.demo.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private DeliveryRiderService deliveryRiderService;

    @GetMapping
    public String adminHome() {
        return "admin/index";
    }

    @GetMapping("/daily-deliveries")
    public String dailyDeliveries(Model model) {
        List<Delivery> deliveries = deliveryService.getDailyDeliveries();
        model.addAttribute("deliveries", deliveries);
        return "admin/daily-deliveries";
    }

    @GetMapping("/riders")
    public String riders(Model model) {
        List<DeliveryRider> riders = deliveryRiderService.getAllRiders();
        model.addAttribute("riders", riders);
        return "admin/riders";
    }
}
