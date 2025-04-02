package types;
import pokemon.Pokemon;


public class GrassType extends Pokemon {
    private String evolution;
    private String special;

    public GrassType(String name, int hp, int atk, double speed, String evolution, String special) {
        super(name, hp, atk, speed);
        this.evolution = evolution;
        this.special = special;
    }

    public void gigaDrain() {
        System.out.println(getName() + " used Giga Drain!");
    }

    public void leech() {
        System.out.println(getName() + " Leeched " + getAtk() + "hp off the enemy!");
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public void evolvesInto()
    {
        System.out.println(getName() + " evolves into " + evolution);
    }
}