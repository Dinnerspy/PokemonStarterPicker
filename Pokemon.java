
import java.util.Random;

public class Pokemon {

    String Region, PokemonName, Type, Category, Pokedex, Ability, HiddenAbility, EvolutionaryChain;
    int PokemonNum;
    Random mygenerator = new Random();

    public Pokemon() {

    }

    public void setRegion(String RegionName) {

        Region = RegionName;
        this.SetPokemon();
    }

    public void SetPokemon() {
        //Pokedex from Fire red
        if (Region.equalsIgnoreCase("Kanto")) {

            PokemonNum = mygenerator.nextInt(3) + 1;
            switch (PokemonNum) {
                case 1:
                    PokemonName = "Bulbasaur";
                    Category = "Seed Pokémon";
                    Type = "Grass and Posion";
                    Ability = "Overgrow: When HP is below 1/3rd its maximum, power of Grass-type moves is increased by 50%.";
                    HiddenAbility = "Chlorophyll: When sunny, the Pokémon’s Speed doubles. However, Speed will not double on the turn weather becomes Strong Sunlight.";
                    Pokedex = "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.";
                    EvolutionaryChain = PokemonName + " evolves into Ivysaur starting at level 16, which evolves into Venusaur starting at level 32.";
                    this.toStringPokemon();
                    break;
                case 2:
                    PokemonName = "Charmander";
                    Category = "Lizard Pokémon";
                    Type = "Fire";
                    Ability = "Blaze: When HP is below 1/3rd its maximum, power of Fire-type moves is increased by 50%.";
                    HiddenAbility = "Solar Power: During sunshine, the Pokémon’s Special Attack raises to 1.5 times but HP decreases by 1/8th the maximum HP every turn.";
                    Pokedex = "From the time it is born, a flame burns at the tip of its tail. Its life would end if the flame were to go out.";
                    EvolutionaryChain = PokemonName + " evolves into Charmeleon starting at level 16, which evolves into Charizard starting at level 36.";
                    this.toStringPokemon();
                    break;
                default:
                    PokemonName = "Squirtle";
                    Category = "Tiny Turtle Pokémon";
                    Type = "Water";
                    Ability = "Torrent: When HP is below 1/3rd its maximum, power of Water-type moves is increased by 50%.";
                    HiddenAbility = "Rain Dish: If Heavy Rain weather is in effect, recovers 1/16th max Hit Points at the end of the turn.";
                    Pokedex = "When it retracts its long neck into its shell, it squirts out water with vigorous force.";
                    EvolutionaryChain = PokemonName + " evolves into Wartortle starting at level 16, which evolves into Blastoise starting at level 36.";
                    this.toStringPokemon();
                    break;
            }

        }
        //Pokedex form gold
        if (Region.equalsIgnoreCase("Johto")) {

            PokemonNum = mygenerator.nextInt(3) + 1;
            switch (PokemonNum) {
                case 1:
                    PokemonName = "Chikorita";
                    Category = "Leaf Pokémon";
                    Type = "Grass";
                    Ability = "Overgrow: When HP is below 1/3rd its maximum, power of Grass-type moves is increased by 50%.";
                    HiddenAbility = "Leaf Guard: Prevents the Pokémon from receiving status conditions during strong sunlight.";
                    Pokedex = "A sweet aroma gently wafts from the leaf on its head. It is docile and loves to soak up the sun's rays.";
                    EvolutionaryChain = PokemonName + " evolves into Bayleef starting at level 16, which evolves into Meganium starting at level 32.";
                    this.toStringPokemon();
                    break;
                case 2:
                    PokemonName = "Cyndaquil";
                    Category = "Fire Mouse Pokémon";
                    Type = "Fire";
                    Ability = "Blaze: When HP is below 1/3rd its maximum, power of Fire-type moves is increased by 50%.";
                    HiddenAbility = "Flash Fire: Activates when user is hit by a damaging Fire-type move (including Fire-type Hidden Power). Once activated, user’s Fire-type moves deal 1.5 times damage.\n While this ability is in effect, this Pokémon is immune to damage from Fire-type attacks";
                    Pokedex = "It is timid, and always curls itself up in a ball. If attacked, it flares up its back for protection.";
                    EvolutionaryChain = PokemonName + " evolves into Quilava starting at level 14, which evolves into Typhlosion starting at level 36.";
                    this.toStringPokemon();
                    break;
                default:
                    PokemonName = "Totodile";
                    Category = "Big Jaw Pokémon";
                    Type = "Water";
                    Ability = "Torrent: When HP is below 1/3rd its maximum, power of Water-type moves is increased by 50%.";
                    HiddenAbility = "Sheer Force: Moves with a secondary effect are increased in power by 33% but lose their secondary effect.";
                    Pokedex = "Its well-developed jaws are powerful and capable of crushing anything. Even its trainer must be careful.";
                    EvolutionaryChain = PokemonName + " evolves into Croconaw starting at level 18, which evolves into Feraligatr starting at level 30.";
                    this.toStringPokemon();
                    break;
            }

        }

        if (Region.equalsIgnoreCase("Hoenn")) {

            PokemonNum = mygenerator.nextInt(3) + 1;

            switch (PokemonNum) {
                case 1:
                    PokemonName = "Treecko";
                    Category = "Wood Gecko Pokémon";
                    Type = "Grass";
                    Ability = "Overgrow: When HP is below 1/3rd its maximum, power of Grass-type moves is increased by 50%.";
                    HiddenAbility = "Unburden: Speed is doubled once the held item is consumed.";
                    Pokedex = "Treecko has small hooks on the bottom of its feet that enable it to scale vertical walls. "
                            + "\nThis Pokémon attacks by slamming foes with its thick tail.";
                    EvolutionaryChain = PokemonName + "  evolves into Grovyle starting at level 16, which evolves into Sceptile starting at level 36.";
                    this.toStringPokemon();
                    break;
                case 2:
                    PokemonName = "Torchic";
                    Category = "Chick Pokémon";
                    Type = "Fire";
                    Ability = "Blaze: When HP is below 1/3rd its maximum, power of Fire-type moves is increased by 50%.";
                    HiddenAbility = "Speed Boost: Speed increases by one stage at the end of each turn.";
                    Pokedex = "Torchic sticks with its Trainer, following behind with unsteady steps. "
                            + "This Pokémon breathes fire of over \n1,800 degrees F, including fireballs that leave the foe scorched black.";
                    EvolutionaryChain = PokemonName + " evolves into Combusken starting at level 16, which evolves into Blaziken starting at level 36.";
                    this.toStringPokemon();
                    break;
                default:
                    PokemonName = "Mudkip";
                    Category = "Mud Fish Pokémon";
                    Type = "Water";
                    Ability = "Torrent: When HP is below 1/3rd its maximum, power of Water-type moves is increased by 50%.";
                    HiddenAbility = "Damp: Explosion and Selfdestruct will not work while the Pokémon is on the field.";
                    Pokedex = "The fin on Mudkip's head acts as highly sensitive radar. "
                            + "Using this fin to sense movements of water and air, "
                            + "\nthis Pokémon can determine what is taking place around it without using its eyes.";
                    EvolutionaryChain = PokemonName + " evolves into Marshtomp starting at level 16, which evolves into Swampert starting at level 36.";
                    this.toStringPokemon();
                    break;
            }

        }

        if (Region.equalsIgnoreCase("Sinnoh")) {

            PokemonNum = mygenerator.nextInt(3) + 1;
            switch (PokemonNum) {
                case 1:
                    PokemonName = "Turtwig";
                    Category = "Tiny Leaf Pokémon";
                    Type = "Grass";
                    Ability = "Overgrow: When HP is below 1/3rd its maximum, power of Grass-type moves is increased by 50%.";
                    HiddenAbility = "Shell Armor: Opponent’s moves cannot Critical Hit.";
                    Pokedex = "Made from soil, the shell on its back hardens when it drinks water. It lives along lakes.";
                    EvolutionaryChain = PokemonName + " evolves into Grotle starting at level 18, which evolves into Torterra starting at level 32.";
                    this.toStringPokemon();
                    break;
                case 2:
                    PokemonName = "Chimchar";
                    Category = "Chimp Pokémon";
                    Type = "Fire";
                    Ability = "Blaze: When HP is below 1/3rd its maximum, power of Fire-type moves is increased by 50%.";
                    HiddenAbility = "Iron Fist: The power of punching moves is increased by 20%.";
                    Pokedex = "It agilely scales sheer cliffs to live atop craggy mountains. Its fire is put out when it sleeps.";
                    EvolutionaryChain = PokemonName + " evolves into Monferno starting at level 14, which evolves into Infernape starting at level 36.";
                    this.toStringPokemon();
                    break;
                default:
                    PokemonName = "Piplup";
                    Category = "Penguin Pokémon";
                    Type = "Water";
                    Ability = "Torrent: When HP is below 1/3rd its maximum, power of Water-type moves is increased by 50%.";
                    HiddenAbility = "Defiant: Attack is raised by two stages when the Pokémon has its stats lowered. Doesn't work on self inflicted stat drops or drops from allies";
                    Pokedex = "Because it is very proud, it hates accepting food from people. Its thick down guards it from cold.";
                    EvolutionaryChain = PokemonName + " evolves into Prinplup starting at level 16, which evolves into Empoleon starting at level 36.";
                    this.toStringPokemon();
                    break;
            }

        }

        if (Region.equalsIgnoreCase("Unova")) {

            PokemonNum = mygenerator.nextInt(3) + 1;
            switch (PokemonNum) {
                case 1:
                    PokemonName = "Snivy";
                    Category = "Grass Snake Pokémon";
                    Type = "Grass";
                    Ability = "Overgrow: When HP is below 1/3rd its maximum, power of Grass-type moves is increased by 50%.";
                    HiddenAbility = "Contrary: Moves used on the Pokémon that raise stats lower the stats, while the moves that lower the stats raise the stat";
                    Pokedex = "It is very intelligent and calm. Being exposed to lots of sunlight makes its movements swifter.";
                    EvolutionaryChain = PokemonName + " evolves into Servine starting at level 17, which evolves into Serperior starting at level 36.";
                    this.toStringPokemon();
                    break;
                case 2:
                    PokemonName = "Tepig";
                    Category = "Fire Pig Pokémon";
                    Type = "Fire";
                    Ability = "Blaze: When HP is below 1/3rd its maximum, power of Fire-type moves is increased by 50%.";
                    HiddenAbility = "Thick Fat: Fire and Ice-type moves deal 50% damage.";
                    Pokedex = "It can deftly dodge its foe's attacks while shooting "
                            + "fireballs from its nose. It roasts berries before it eats them.";
                    EvolutionaryChain = PokemonName + " evolves into Pignite starting at level 17, which evolves into Emboar starting at level 36.";
                    this.toStringPokemon();
                    break;
                default:
                    PokemonName = "Oshawott";
                    Category = "Sea Otter Pokémon";
                    Type = "Water";
                    Ability = "Torrent: When HP is below 1/3rd its maximum, power of Water-type moves is increased by 50%.";
                    HiddenAbility = "Shell Armor: Opponent’s moves cannot Critical Hit.";
                    Pokedex = "It fights using the scalchop on its stomach. In response to an attack, it retaliates immediately by slashing.";
                    EvolutionaryChain = PokemonName + " evolves into Dewott starting at level 17, which evolves into Samurott starting at level 36.";
                    this.toStringPokemon();
                    break;
            }

        }

        if (Region.equalsIgnoreCase("Kalos")) {

            PokemonNum = mygenerator.nextInt(3) + 1;
            switch (PokemonNum) {
                case 1:
                    PokemonName = "Chespin";
                    Category = "Spiky Nut Pokémon";
                    Type = "Grass";
                    Ability = "Overgrow: When HP is below 1/3rd its maximum, power of Grass-type moves is increased by 50%.";
                    HiddenAbility = "Bulletproof: Protects the Pokémon from some ball and bomb moves.";
                    Pokedex = "The quills on its head are usually soft. "
                            + "When it flexes them, the points become so hard and sharp that they can pierce rock.";
                    EvolutionaryChain = PokemonName + " evolves into Quilladin starting at level 16, which evolves into Chesnaught starting at level 36.";
                    this.toStringPokemon();
                    break;
                case 2:
                    PokemonName = "Fennekin";
                    Category = "Fox Pokémon";
                    Type = "Fire";
                    Ability = "Blaze: When HP is below 1/3rd its maximum, power of Fire-type moves is increased by 50%.";
                    HiddenAbility = "Magician: The Pokémon steals the held item of a Pokémon it hits with a move.";
                    Pokedex = "Eating a twig fills it with energy, "
                            + "and its roomy ears give vent to air hotter than 390 degrees Fahrenheit.";
                    EvolutionaryChain = PokemonName + " evolves into Frogadier starting at level 16, which evolves into Greninja starting at level 36.";
                    this.toStringPokemon();
                    break;
                default:
                    PokemonName = "Froakie";
                    Category = "Bubble Frog Pokémon";
                    Type = "Water";
                    Ability = "Torrent: When HP is below 1/3rd its maximum, power of Water-type moves is increased by 50%.";
                    HiddenAbility = "Protean: Before the Pokémon uses a move, it becomes a pure Pokémon of that type.";
                    Pokedex = "It secretes flexible bubbles from its chest and back."
                            + " The bubbles reduce the damage it would otherwise take when attacked.";
                    EvolutionaryChain = PokemonName + " evolves into Frogadier starting at level 16, which evolves into Greninja starting at level 36.";
                    this.toStringPokemon();
                    break;
            }

        }

        if (Region.equalsIgnoreCase("Alola")) {

            PokemonNum = mygenerator.nextInt(3) + 1;
            switch (PokemonNum) {
                case 1:
                    PokemonName = "Rowlet";
                    Category = "Grass Quill Pokémon";
                    Type = "Grass and Flying";
                    Ability = "Overgrow: When HP is below 1/3rd its maximum, power of Grass-type moves is increased by 50%.";
                    HiddenAbility = "Long Reach: The Pokémon uses its moves without making contact with the target.";
                    Pokedex = "This wary Pokémon uses photosynthesis to store up energy during the day,"
                            + " while becoming active at night";
                    EvolutionaryChain = PokemonName + " evolves into Dartrix starting at level 17, which evolves into Decidueye starting at level 34.";
                    this.toStringPokemon();
                    break;
                case 2:
                    PokemonName = "Litten";
                    Category = "Fire Cat Pokémon";
                    Type = "Fire";
                    Ability = "Blaze: When HP is below 1/3rd its maximum, power of Fire-type moves is increased by 50%.";
                    HiddenAbility = "Intimidate: Upon entering battle, the opponent’s Attack lowers one stage. In a Double Battle, both opponents’ Attack are lowered. Pokémon with the Clear Body, Hyper Cutter, or White Smoke ability are unaffected";
                    Pokedex = "While grooming itself, it builds up fur inside its stomach."
                            + " It sets the fur alight and spews fiery attacks, which change based on how it coughs.";
                    EvolutionaryChain = PokemonName + " evolves into Torracat starting at level 17, which evolves into Incineroar starting at level 34.";
                    this.toStringPokemon();
                    break;
                default:
                    PokemonName = "Popplio";
                    Category = "Sea Lion Pokémon";
                    Type = "Water";
                    Ability = "Torrent: When HP is below 1/3rd its maximum, power of Water-type moves is increased by 50%.";
                    HiddenAbility = "Liquid Voice: All sound-based moves become Water-type moves.";
                    Pokedex = "This Pokémon snorts body fluids from its nose, blowing balloons to smash into its foes."
                            + " It's famous for being a hard worker.";
                    EvolutionaryChain = PokemonName + " evolves into Brionne starting at level 17, which evolves into Primarina starting at level 34.";
                    this.toStringPokemon();
                    break;
            }

        }

    }

    public String toStringPokemon() {

        System.out.println("\nThe pokemon you sould pick for the " + Region + " Region would be:\n" 
                + PokemonName + "\nClassification: The " + Category 
                + "\nType: " + Type + "\nAbility: " + Ability + "\nHiddenAbility: " 
                + HiddenAbility + "\nPokexdex :" + Pokedex+"\nEvolutionary Chain: "
                + EvolutionaryChain);

        return "";

    }
}
