
package com.example.demo.service;

import com.example.demo.model.Delivery;
import com.example.demo.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public List<Delivery> getDailyDeliveries() {
        return deliveryRepository.findAll().stream()
                .filter(delivery -> delivery.getDeliveryTime().toLocalDate().isEqual(LocalDate.now()))
                .collect(Collectors.toList());
    }
}
