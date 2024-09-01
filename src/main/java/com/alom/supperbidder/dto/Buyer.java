package com.alom.supperbidder.dto;

import java.util.List;
import java.util.Map;

public class Buyer {
    private String name;
//    private List<Auction> auctions;
    public Buyer(String name) {
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
