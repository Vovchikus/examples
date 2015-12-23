import java.util.ArrayList;
import java.util.List;

/**
 * Leaf Archer
 */
public class Archer implements Unit {

    /**
     * List of possible units
     */
    List<Unit> units = new ArrayList<Unit>();

    private int strength;

    private int defence;

    public Archer(int strength, int defence) {
        this.strength = strength;
        this.defence = defence;
    }

    @Override
    public void add(Unit unit) {
        units.add(unit);
    }

    public void print() {
        System.out.format("Unit %s: strength - %d, defence - %d\n", this.getClass().getName(), this.getStrength(), this.getDefence());
    }

    @Override
    public Unit getChild(int i) {
        return null;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public int getDefence() {
        return this.defence;
    }
}
