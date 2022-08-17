package ru.geekbrains.spring.web.model;

public class Product {


    private Long id;
    private String title;
    private int cots;

    public Product() {

    }

    public Product(Long id, String title, int cots) {
        this.id = id;
        this.title = title;
        this.cots = cots;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCots() {
        return cots;
    }
}
