import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Grand piano", 6000, 10000, InstrumentType.KEYBOARD, "Mahogany", "Wood", 500);
    }

    @Test
    public void testCanGetWeight() {
        assertEquals(500, piano.getWeight());
    }

    @Test
    public void testCanPlay() {
        assertEquals("This is what a piano sounds like", piano.play());
    }
}
