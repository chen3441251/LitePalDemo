package com.example.cc.litepaldemo.bean;

/**
 * @创建者 :           chaochen
 * @创建时间 :         2017/9/24 22:14
 * @描述 :           ${TODO}
 */


public class Category {
    private int id;
    private String categoryName;
    private int categoryCode;

    public Category(int id, String categoryName, int categoryCode) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }
}
