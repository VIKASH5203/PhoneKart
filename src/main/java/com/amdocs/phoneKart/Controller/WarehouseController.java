package com.amdocs.phoneKart.Controller;

import com.amdocs.phoneKart.Entity.Warehouse;
import com.amdocs.phoneKart.Repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses")
@CrossOrigin("http://localhost:3000/")
public class WarehouseController {
    @Autowired
    private WarehouseRepository warehouseRepository;

    @PostMapping
    public Warehouse createWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    @GetMapping
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }
}


