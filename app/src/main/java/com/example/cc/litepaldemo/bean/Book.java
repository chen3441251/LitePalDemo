package com.example.cc.litepaldemo.bean;

import org.litepal.crud.DataSupport;

/**
 * @创建者 :           chaochen
 * @创建时间 :         2017/9/24 22:00
 * @描述 :           ${TODO}
 */


public class Book extends DataSupport {
    private  int id;
    private String author;
    private double price;
    private int pages;
    private String name;
    private String press;

    public Book( String author, double price, int pages, String name, String press) {
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.name = name;
        this.press = press;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
