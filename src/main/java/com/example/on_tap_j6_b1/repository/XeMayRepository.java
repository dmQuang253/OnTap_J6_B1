package com.example.on_tap_j6_b1.repository;

import com.example.on_tap_j6_b1.entity.XeMay;
import com.example.on_tap_j6_b1.model.response.XeMayResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XeMayRepository extends JpaRepository<XeMay, Long> {
@Query("""
SELECT new com.example.on_tap_j6_b1.model.response.XeMayResponse(
    xm.id,
    xm.ma,
    xm.ten,
    xm.ngaySanXuat,
    xm.moTa,
    xm.soLuong,
    xm.website,
    xm.loaiXeMay.ten,
    xm.trangThai)
FROM XeMay xm
""")
    List<XeMayResponse> getall();

@Query("""
SELECT new com.example.on_tap_j6_b1.model.response.XeMayResponse(
    xm.id,
    xm.ma,
    xm.ten,
    xm.ngaySanXuat,
    xm.moTa,
    xm.soLuong,
    xm.website,
    xm.loaiXeMay.ten,
    xm.trangThai)
FROM XeMay xm
""")
    List<XeMayResponse> phanTrang(Pageable pageable);
}
