package partc;

public class Product {
    private Integer id;
    private String productName;
    private Double price;
    private Category category;

    public Product(Integer id, String productName, Double price, Category category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product { " +
                "id = " + id +
                ", productName = '" + productName + '\'' +
                ", price = " + price +
                ", category = " + category +
                " } \n";
    }
}
