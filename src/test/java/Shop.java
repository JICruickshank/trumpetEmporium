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

    public void removeFromStock(Product product) {
                stock.remove(product);
        }

    public int calculateTotalProfit() {
        int total = 0;
        for (Product item : stock) {
             total += item.calculateMarkUp();
        }
        return total;
    }
}
