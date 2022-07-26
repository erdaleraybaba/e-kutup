package com.kutuphhane.yeni.service;

import com.kutuphhane.yeni.model.Kitap;
import com.kutuphhane.yeni.model.Siparis;
import com.kutuphhane.yeni.model.Uye;
import com.kutuphhane.yeni.repository.KitapRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;@Service
public class KitapService {

    private final KitapRepository kitapRepository;

    public KitapService(KitapRepository kitapRepository) {

        this.kitapRepository = kitapRepository;
    }

    public Optional<Kitap> findKitapById(Integer KitapId) {
        Uye uye = new Uye();
        Siparis siparis = new Siparis();
        siparis.setUye(uye);
//        Uye uye = new Uye();
//
//        List<Siparis> siparisList = new ArrayList<Siparis>();
//        Siparis siparis = new Siparis();
//        siparis.s
//        siparisList.add(siparis);
//        uye.setAlimlar(siparisList);
        return kitapRepository.findById(KitapId);
    }

}


