package com.example.androidweek4;

public class Goods {
    private String name ;
    private String shopName;
    private int imageGoods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }

    public Goods(String name) {
        this.name = name;
    }
}
