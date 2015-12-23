import java.util.ArrayList;
import java.util.List;

/**
 * Composite class Hero
 *
 */
public class Hero implements Unit {

    private int strength;

    private int defence;

    private String name;

    private int sumChildrenStrength;

    private int sumChildrenDefence;

    /**
     * List of possible units
     */
    private List<Unit> units = new ArrayList<Unit>();

    public Hero(String name, int strength, int defence) {
        this.name = name;
        this.strength = strength;
        this.defence = defence;
    }

    @Override
    public void add(Unit unit) {
        this.units.add(unit);
        this.setSumChildrenDefence(unit.getDefence());
        this.setSumChildrenStrength(unit.getStrength());
    }

    @Override
    public void print() {

        System.out.format("Hero %s: strength - %d, defence - %d\n", this.getName(), this.getStrength(), this.getDefence());
        System.out.format("Army: strength - %d, defence - %d\n", this.getSumChildrenStrength(), this.getSumChildrenDefence());
        System.out.format("Army + Hero: strength - %d, defence - %d\n", this.totalSumStrength(), this.totalSumDefence());

        for (Unit unit : units) {
            unit.print();
        }

    }

    public int getSumChildrenStrength() {
        return this.sumChildrenStrength;
    }

    public int getSumChildrenDefence() {
        return this.sumChildrenDefence;
    }

    private void setSumChildrenStrength(int childStrength) {
        this.sumChildrenStrength += childStrength;
    }

    private void setSumChildrenDefence(int childDefence) {
        this.sumChildrenDefence += childDefence;
    }

    private int totalSumStrength() {
        return this.getStrength() + this.getSumChildrenStrength();
    }

    private int totalSumDefence() {
        return this.getDefence() + this.getSumChildrenDefence();
    }

    private String getName() {
        return this.name;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public int getDefence() {
        return this.defence;
    }

    @Override
    public Unit getChild(int i) {
        return this.units.get(i);
    }
}
