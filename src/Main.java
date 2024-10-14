public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setDamage(60);
        boss1.setHealth(800);
        boss1.setDefence("Magical");

        System.out.println("health = " + boss1.getHealth() + "Damage = " + boss1.getDamage() + "Defence = " + boss1.getDefence());
        createHeroes();
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 30, "Strength" );
        Hero hero2 = new Hero(35, 200);
        Hero hero3 = new Hero(220, 32, "Invisible");

        Hero[] heroes = {hero1, hero2, hero3};

        for (Hero hero : heroes){
            System.out.println("Heroes health = " + hero.getHealth() + "Heroes damage = " + hero.getDamage()
            + "Heroes ability = " + hero.getAbility());
        }
        return heroes;
    }
}