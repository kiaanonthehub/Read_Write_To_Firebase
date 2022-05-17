package com.kiaan.readwritetofirebase;

public class Category {

    private String categoryName, categoryDesc;
    private int categoryGoal;

    public Category(String categoryName, String categoryDesc, int categoryGoal) {
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
        this.categoryGoal = categoryGoal;
    }

    public Category(String categoryName, int categoryGoal) {
        this.categoryName = categoryName;
        this.categoryGoal = categoryGoal;
        categoryDesc = null;
    }
}
