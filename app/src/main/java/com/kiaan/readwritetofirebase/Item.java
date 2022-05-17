package com.kiaan.readwritetofirebase;

public class Item {

    private String itemName, itemDesc, itemCategory;

    public Item(String itemName, String itemDesc, String itemCategory) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemCategory = itemCategory;
    }

    public Item(String itemName, String itemCategory) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        itemDesc = null;
    }

}
