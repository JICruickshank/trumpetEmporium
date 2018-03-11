import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    private Accessory accessory;

    @Before
    public void setUp() throws Exception {
        accessory = new Accessory("Drum sticks", 10, 20, InstrumentType.PERCUSSION);
    }

    @Test
    public void testCanGetDescription() {
        assertEquals(InstrumentType.PERCUSSION, accessory.getType());
    }
}
