import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return products;
    }
}
