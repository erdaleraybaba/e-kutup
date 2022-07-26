package com.kutuphhane.yeni.service;

import com.kutuphhane.yeni.model.Kitap;
import com.kutuphhane.yeni.model.Siparis;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SiparisService {
    private final KitapService kitapService;


    public SiparisService(KitapService kitapService) {
        this.kitapService = kitapService;
    }
    public Siparis putAnOrder(List<String> kitapIdList){
        List<Optional<Kitap>> kitapList = kitapIdList.stream()
                .map((String kitapId) -> kitapService.findKitapById(Integer.valueOf(kitapId))).collect(Collectors.toList());

        return null;
    }

}
