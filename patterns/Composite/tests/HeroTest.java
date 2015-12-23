import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class HeroTest {

    private Hero hero;

    @Before
    public void setUp() throws Exception {
        this.hero = new Hero("HERO", 50, 100);
        Unit child = new Archer(5, 15);
        Unit child1 = new Pikeman(5, 15);
        this.hero.add(child);
        this.hero.add(child1);
    }

    @Test
    public void testGetSumChildrenStrength() throws Exception {
        assertEquals("Sum children strength", this.hero.getSumChildrenStrength(), 10);
    }

    @Test
    public void testGetSumChildrenDefence() throws Exception {
        assertEquals("Sum children defence", this.hero.getSumChildrenDefence(), 30);
    }

    @Test
    public void testGetStrength() throws Exception {
        assertEquals("Hero Strength", this.hero.getStrength(), 50);
    }

    @Test
    public void testGetDefence() throws Exception {
        assertEquals("Hero Defence", this.hero.getDefence(), 100);
    }
}