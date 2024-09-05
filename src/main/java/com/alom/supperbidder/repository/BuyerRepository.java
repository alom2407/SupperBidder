package com.alom.supperbidder.repository;

import com.alom.supperbidder.dto.Buyer;

import java.util.HashMap;
import java.util.Map;

public class BuyerRepository {
    Map<String, Buyer> buyerMap;

    public BuyerRepository() {
        this.buyerMap = new HashMap<>();
    }
}
