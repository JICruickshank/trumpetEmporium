public abstract class Product implements ISell {

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

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkUp() {
        return getSalePrice() - getPurchasePrice();

    }

}
