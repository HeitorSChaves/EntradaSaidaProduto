package entities;

public class Product {

    //Atributes
    private String name;
    private Double price;

    //Constructors

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
