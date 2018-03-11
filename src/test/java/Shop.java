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

    public void removeFromStock(int number) {
        Product productToRemove = findProductByNumber(number);
                stock.remove(productToRemove);
        }

    public int calculateTotalProfit() {
        int total = 0;
        for (Product item : stock) {
             total += item.calculateMarkUp();
        }
        return total;
    }


    public Product findProductByNumber(int number) {
        Product foundProduct = null;
        for (Product product : stock) {
            if (product.getProductNumber() == number) {
                foundProduct = product;
            }
        }
        return foundProduct;
    }
}
