import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentType.STRING, "White", "Wood", 6);
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
}
