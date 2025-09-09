package com.amdocs.phoneKart.Repository;

import com.amdocs.phoneKart.Entity.Product;
import com.amdocs.phoneKart.Entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    Product findByBrandAndModelAndColorAndSizeAndTypeAndPriceAndWarehouse(String brand, String model, String color, String size, String type, String price, Warehouse warehouse);


    List<Product> findByBrandAndModel(String brand, String model);

    List<Product> findByType(String accessory);

}


