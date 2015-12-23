import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CavalierTest {

    private Cavalier cavalier;

    @Before
    public void setUp() throws Exception {
        this.cavalier = new Cavalier(100, 150);
    }

    @Test
    public void testGetStrength() throws Exception {
        assertEquals("Cavalier Strength", this.cavalier.getStrength(), 100);
    }

    @Test
    public void testGetDefence() throws Exception {
        assertEquals("Cavalier Defence", this.cavalier.getDefence(), 150);
    }
}