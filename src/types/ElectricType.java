package types;
import pokemon.Pokemon;


public class ElectricType extends Pokemon {
    private String evolution;
    private String special;

    public ElectricType(String name, int hp, int atk, double speed, String evolution, String special) {
        super(name, hp, atk, speed);
        this.evolution = evolution;
        this.special = special;
    }

    public void voltTackle() {
        System.out.println(getName() + " used Volt Tackle! It's very effective!");
    }

    public void thunderbolt() {
        System.out.println(getName() + " used Thunderbolt! It's very effective!");
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