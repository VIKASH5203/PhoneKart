package com.amdocs.phoneKart.Controller;

import com.amdocs.phoneKart.Services.OrderServicesImple;
import com.amdocs.phoneKart.dto.AddressRequest;
import com.amdocs.phoneKart.model.Orders;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
@Table(name = "Orders")
public class AddressController {
    @Autowired
    private OrderServicesImple orderServicesImple;
    @Column(name = "userAddress")
    private String userAddress; // This variable simulates your database storage

    @PutMapping("/updateAddress/{id}")
    public ResponseEntity<Orders> updateAddress(@RequestBody AddressRequest addressRequest, @PathVariable long id) {
        userAddress = addressRequest.getAddressLine1() + ", " +
                addressRequest.getAddressLine2() + ", " +
                addressRequest.getLandmark() + ", " +
                addressRequest.getRoad();

        return ResponseEntity.ok(orderServicesImple.updateAddress(id, userAddress));

//        return "Address updated successfully!";
    }

        // Getter method to retrieve user's address (for demonstration purposes)
        @GetMapping("/getUserAddress/{id}")
        public ResponseEntity<String> getUserAddress(@PathVariable long id) {
            return ResponseEntity.ok(orderServicesImple.getAddressbyOrderId(id));
        }

}
