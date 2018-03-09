import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return stock;
    }

    public void addToStock(Product product) {
        stock.add(product);
    }
}
