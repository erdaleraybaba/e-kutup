package com.kutuphhane.yeni.service;

import com.kutuphhane.yeni.model.Siparis;
import com.kutuphhane.yeni.model.Uye;
import org.springframework.stereotype.Service;

@Service
public class UyeService {

    public String deneme() {

        Uye uye = new Uye();
        Siparis siparis = new Siparis();
        siparis.setUye(uye);

        return "asdsa";
    }

}
