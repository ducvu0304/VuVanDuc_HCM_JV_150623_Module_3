package ra.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private static int id = 1;
    private int productId;
    private String name;
    private String manufacture;
    private double price;
    private String descriptions;

    public Product() {
    }

    public Product(String name, String manufacture, double price, String descriptions) {
        this.productId = id++;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.descriptions = descriptions;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Product.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
