package com.alom.supperbidder.dto;

import java.util.Map;

public class Auction {
    private String productName;
    private int minBid;
    private int maxBid;
    private Seller seller;
    private boolean isActive;
    private Map<Buyer,Integer> bids;

    public Auction(String productName, int minBid, int maxBid, Seller seller, boolean isActive, Map<Buyer, Integer> bids) {
        this.productName = productName;
        this.minBid = minBid;
        this.maxBid = maxBid;
        this.seller = seller;
        this.isActive = isActive;
        this.bids = bids;
    }

    public Auction() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getMinBid() {
        return minBid;
    }

    public void setMinBid(int minBid) {
        this.minBid = minBid;
    }

    public int getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(int maxBid) {
        this.maxBid = maxBid;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Map<Buyer, Integer> getBids() {
        return bids;
    }

    public void setBids(Map<Buyer, Integer> bids) {
        this.bids = bids;
    }
}
