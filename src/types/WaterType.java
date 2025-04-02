package types;
import pokemon.Pokemon;


public class WaterType extends Pokemon {
    private String evolution;
    private boolean isRaining;

    public WaterType(String name, int hp, int atk, double speed, String evolution, boolean isRaining) {
        super(name, hp, atk, speed);
        this.evolution = evolution;
        this.isRaining = isRaining;
        terrainEffect();
    }

    public void terrainEffect() {
        if(isRaining) {
            System.out.println(getName() + " gained 10atk points due to rain!");
        }
    }

    public void surf() {
        System.out.println(getName() + " used Surf!");
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public boolean getIsRaining() {
        return isRaining;
    }

    public void setIsRaining(boolean isRaining) {
        this.isRaining = isRaining;
    }

    @Override
    public void evolvesInto()
    {
        System.out.println(getName() + " evolves into " + evolution);
    }

    public void eats()
    {
        System.out.println(getName() + " eats berries.");
    }
}