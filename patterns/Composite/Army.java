public class Army {
    public static void main(String[] args) {

        Unit archer = new Archer(20, 2);
        Unit cavalier = new Cavalier(50, 30);
        Unit pikeman = new Pikeman(5, 25);

        Unit hero = new Hero("IVOR", 100, 100);
        hero.add(archer);
        hero.add(archer);

        Unit hero1 = new Hero("GELU", 120, 50);
        hero1.add(cavalier);
        hero1.add(pikeman);
        hero1.add(hero);

        hero1.print();
    }
}

