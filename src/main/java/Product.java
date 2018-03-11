public abstract class Product implements ISell {

    private String description;
    private double purchasePrice;
    private double salePrice;
    private int number;

    public Product(String description, double purchasePrice, double salePrice, int number) {
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.number = number;
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

    public int getProductNumber() {
        return number;
    }
}
