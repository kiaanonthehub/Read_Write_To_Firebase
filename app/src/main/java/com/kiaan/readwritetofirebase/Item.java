package com.kiaan.readwritetofirebase;

public class Item {

    // variables
    private String itemName, itemDesc, itemCategory;

    // constructor
    public Item(String itemName, String itemDesc, String itemCategory) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemCategory = itemCategory;
    }


    /*
    Getters and Setters
     */
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }



}
