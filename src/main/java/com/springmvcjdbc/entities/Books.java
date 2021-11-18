package com.springmvcjdbc.entities;

public class Books {
    private int id;
    private String title;
    private Float price;
    private Category cat;

    public Books(int id, String title, Float price, Category cat) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.cat = cat;
    }

    public Books() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }
}
