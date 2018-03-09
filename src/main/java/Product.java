public abstract class Product {
    
    private String description;
    private double purchasePrice;
    private double salePrice;

    public Product(String description, double purchasePrice, double salePrice) {
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }
}
