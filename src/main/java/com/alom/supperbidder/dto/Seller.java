package com.alom.supperbidder.dto;

import java.util.List;

public class Seller {
    private String name;
//    private List<Auction> auctions;

    public Seller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Auction> getAuctions() {
//        return auctions;
//    }
//
//    public void setAuctions(List<Auction> auctions) {
//        this.auctions = auctions;
//    }
}
