package com.example.catalog;

import java.util.List;

public class Category {
    int id;
    int idParent;
    String name;

    public int getId() {
        return id;
    }

    public int getIdParent() {
        return idParent;
    }

    public String getName() {
        return name;
    }

    List<Product> products;
    public Category(int id, int idParent, String name, List<Category> subCategory, List<Product> products) {
        this.id = id;
        this.idParent = idParent;
        this.name = name;
        this.products = products;
    }


}
