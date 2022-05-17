package com.kiaan.readwritetofirebase;

public class Category {

    private String categoryName, categoryDesc, categoryGoal;

    public Category() {
    }

    public Category(String categoryName, String categoryDesc, String categoryGoal) {
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
        this.categoryGoal = categoryGoal;
    }

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
