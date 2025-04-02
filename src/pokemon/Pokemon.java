package pokemon;

public abstract class Pokemon {
    private String name;
    private int hp;
    private int atk;
    private double speed;

    public Pokemon(String name, int hp, int atk, double speed) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.speed = speed;
    }

    public void eats() {
        System.out.println("No information on this pokemon in the Pokedex.");
    }

    public abstract void evolvesInto();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

