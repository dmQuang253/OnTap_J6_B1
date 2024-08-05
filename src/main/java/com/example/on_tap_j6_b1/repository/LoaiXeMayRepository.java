package com.example.on_tap_j6_b1.repository;

import com.example.on_tap_j6_b1.entity.LoaiXeMay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiXeMayRepository extends JpaRepository<LoaiXeMay, Long> {
}
