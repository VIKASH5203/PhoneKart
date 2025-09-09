package com.amdocs.phoneKart.Repository;

import com.amdocs.phoneKart.Entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}