package com.example.catalog;

public class Product {
    String name;
    int id;
    int idParent;
    public Product(String name, int id, int idParent) {
        this.name = name;
        this.id = id;
        this.idParent = idParent;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getIdParent() {
        return idParent;
    }
}
