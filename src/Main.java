import types.ElectricType;
import types.FireType;
import types.GrassType;
import types.WaterType;

public class Main {
    public static void main(String[] args) {

        WaterType squirtle = new WaterType("Squirtle", 100, 50, 35.2, "Wartortle", true);
        FireType charmander = new FireType("Charmander", 120, 70, 20, "Charmaleon", true);
        GrassType bulbasaur = new GrassType("Bulbasaur", 150, 40, 25, "Ivysaur", "Poison Powder");
        ElectricType pikachu = new ElectricType("Pikachu", 200, 35, 50, "Raichu", "Gigavolt Havoc");

        squirtle.surf();
        squirtle.evolvesInto();
        squirtle.eats();

        charmander.evolvesInto();
        charmander.flamethrower();
        charmander.eats();

        bulbasaur.evolvesInto();
        bulbasaur.leech();
        bulbasaur.gigaDrain();

        pikachu.evolvesInto();
        pikachu.thunderbolt();
        pikachu.voltTackle();
    }
}