import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Guitar guitar;
    private Accessory accessory;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        guitar = new Guitar("Bass Guitar", 150, 300, InstrumentType.STRING, "White", "Wood", 6, 1);
        accessory = new Accessory("Guitar Case", 5, 20, InstrumentType.STRING, 3);
    }

    @Test
    public void testShopIsEmpty() {
        assertEquals(0, shop.getProductList().size());
    }

    @Test
    public void testCanAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getProductList().size());
    }

    @Test
    public void testCanRemoveFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(accessory);
        assertEquals(2, shop.getProductList().size());
        shop.removeFromStock(1);
        assertEquals(1, shop.getProductList().size());
        }

    @Test
    public void testCanGetTotalProfit() {
        shop.addToStock(guitar);
        shop.addToStock(accessory);
        assertEquals(165, shop.calculateTotalProfit());
    }

    @Test
    public void testCanFindProductByNumber() {
        shop.addToStock(guitar);
        shop.addToStock(accessory);
        Product result = shop.findProductByNumber(1);
        assertEquals("Bass Guitar", result.getDescription());


    }
}
