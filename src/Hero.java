public class Hero {
    private int health;
    private int damage;
    private String ability;

    public Hero (int health, int damage, String ability) {
        this.ability = ability;
        this.health =  health;
        this.damage = damage;
    }
    public Hero (int damage, int health){
        this.damage = damage;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getAbility() {
        return ability;
    }
}
