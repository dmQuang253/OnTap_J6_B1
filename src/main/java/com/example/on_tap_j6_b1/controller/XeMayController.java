package com.example.on_tap_j6_b1.controller;

import com.example.on_tap_j6_b1.repository.LoaiXeMayRepository;
import com.example.on_tap_j6_b1.repository.XeMayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XeMayController {
@Autowired
    private XeMayRepository xeMayRepository;

@Autowired
    private LoaiXeMayRepository loaiXeMayRepository;

@GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
    return new ResponseEntity<>(xeMayRepository.getall(), HttpStatus.OK);
}
@GetMapping("/phan-trang")
    public ResponseEntity<?> phanTrang(@RequestParam(value = "cur", defaultValue = "0")Integer cur){
    int size = 2;
    Pageable pageable = PageRequest.of(cur, size);
    return new ResponseEntity<>(xeMayRepository.phanTrang(pageable), HttpStatus.OK);
}


}
