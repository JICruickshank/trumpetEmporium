import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Bass Guitar", 150, 300, InstrumentType.STRING, "White", "Wood", 6);
    }

    @Test
    public void testGetNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void testGetType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void testGetColour() {
        assertEquals("White", guitar.getColour());
    }

    @Test
    public void testGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void testCanGetDescription() {
        assertEquals("Bass Guitar", guitar.getDescription());
    }

    @Test
    public void testCanGetPurchasePrice() {
        assertEquals(150, guitar.getPurchasePrice(), 0.01);

    }

    @Test
    public void testCanGetSalePrice() {
        assertEquals(300, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void testCanPlay() {
        assertEquals("Generic guitar noise", guitar.play());
    }

    @Test
    public void testCalculateMarkUp() {
        assertEquals(150, guitar.calculateMarkUp(), 0.01);
    }
}
