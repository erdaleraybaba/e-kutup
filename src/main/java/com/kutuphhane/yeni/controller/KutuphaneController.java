package com.kutuphhane.yeni.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/kitapalim")
public class KutuphaneController {

    @GetMapping
    public ResponseEntity<String> kitapAlindi(){
        return ResponseEntity.ok("Kitabı Aldınız!");
    }

}
