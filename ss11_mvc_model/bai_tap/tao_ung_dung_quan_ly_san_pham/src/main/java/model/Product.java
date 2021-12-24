package model;

public class Product {
    private int id;
    private String name;
    private String Brand;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String grand, double price) {
        this.id = id;
        this.name = name;
        this.Brand = grand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
