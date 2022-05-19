package com.kiaan.readwritetofirebase;

public class Category {

    // variables
    private String categoryName, categoryDesc, categoryGoal;

    // default constructor
    public Category() {
    }

    // constructor
    public Category(String categoryName, String categoryDesc, String categoryGoal) {
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
        this.categoryGoal = categoryGoal;
    }

    /*
    Getters and Setters
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public String getCategoryGoal() {
        return categoryGoal;
    }

    public void setCategoryGoal(String categoryGoal) {
        this.categoryGoal = categoryGoal;
    }


}
