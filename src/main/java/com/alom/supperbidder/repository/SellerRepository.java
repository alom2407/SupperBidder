package com.alom.supperbidder.repository;

import com.alom.supperbidder.dto.Seller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerRepository {
    Map<String,Seller> sellersRepo;

    public SellerRepository(){
        sellersRepo = new HashMap<>();
    }

    public Seller getSellerByName(String name){
        return  sellersRepo.get(name);
    }

}
