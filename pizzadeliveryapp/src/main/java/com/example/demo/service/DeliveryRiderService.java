
package com.example.demo.service;

import com.example.demo.model.DeliveryRider;
import com.example.demo.repository.DeliveryRiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryRiderService {

    @Autowired
    private DeliveryRiderRepository deliveryRiderRepository;

    public List<DeliveryRider> getAllRiders() {
        return deliveryRiderRepository.findAll();
    }

    public DeliveryRider saveRider(DeliveryRider rider) {
        return deliveryRiderRepository.save(rider);
    }
}
