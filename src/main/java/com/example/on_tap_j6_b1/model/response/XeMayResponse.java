package com.example.on_tap_j6_b1.model.response;

import com.example.on_tap_j6_b1.entity.LoaiXeMay;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class XeMayResponse {
    private Long id;

    private String ma;

    private String ten;

    private Date ngaySanXuat;

    private String moTa;

    private Integer soLuong;

    private String website;

    private String tenLoaiXeMay;

    private Integer trangThai;
}
