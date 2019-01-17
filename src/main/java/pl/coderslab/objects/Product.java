package pl.coderslab.objects;

public class Product {
    private String name;
    private double price;
    private Long id;

    public Product( Long id, String name, double price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
