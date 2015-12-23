import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PikemanTest {

    private Pikeman pikeman;

    @Before
    public void setUp() throws Exception {
        this.pikeman = new Pikeman(25, 12);
    }

    @Test
    public void testGetStrength() throws Exception {
        assertEquals("Pikeman Strength", this.pikeman.getStrength(), 25);
    }

    @Test
    public void testGetDefence() throws Exception {
        assertEquals("Pikeman Defence", this.pikeman.getDefence(), 12);
    }
}