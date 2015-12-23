import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArcherTest {

    private Archer archer;

    @Before
    public void setUp() throws Exception {
        this.archer = new Archer(125, 215);
    }

    @Test
    public void testGetStrength() throws Exception {
        assertEquals("Archer Strength", this.archer.getStrength(), 125);
    }

    @Test
    public void testGetDefence() throws Exception {
        assertEquals("Archer Defence", this.archer.getDefence(), 215);
    }
}