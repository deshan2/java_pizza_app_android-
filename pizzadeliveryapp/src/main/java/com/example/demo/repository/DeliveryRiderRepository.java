
package com.example.demo.repository;

import com.example.demo.model.DeliveryRider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRiderRepository extends JpaRepository<DeliveryRider, Long> {
}
