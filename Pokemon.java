import java.util.Random;
public class Pokemon {
    
    String Region,PokemonName;
    int PokemonNum;
    Random mygenerator = new Random();
    public Pokemon(){
    
    }
    
    public void setRegion(String RegionName){
    
    Region=RegionName;
    this.SetPokemon();
    }
    
    public void SetPokemon(){
    
    if(Region.equalsIgnoreCase("Kanto")){
        
       PokemonNum= mygenerator.nextInt(3)+1;
        switch (PokemonNum) {
            case 1:
                PokemonName="Bulbasaur";
                 this.toStringPokemon();
                break;
            case 2:
                PokemonName="Charmander";
                 this.toStringPokemon();
                break;
            default:
                PokemonName="Squirtle";
                 this.toStringPokemon();
                break;
        }
       
    
    
    }
        if(Region.equalsIgnoreCase("Johto")){
        
       PokemonNum= mygenerator.nextInt(3)+1;
        switch (PokemonNum) {
            case 1:
                PokemonName="Chikorita";
                 this.toStringPokemon();
                break;
            case 2:
                PokemonName="Cyndaquil";
                 this.toStringPokemon();
                break;
            default:
                PokemonName="Totodile";
                 this.toStringPokemon();
                break;
        }
       
    
    
    }
        
        if(Region.equalsIgnoreCase("Hoenn")){
        
       PokemonNum= mygenerator.nextInt(3)+1;
        switch (PokemonNum) {
            case 1:
                PokemonName="Treecko";
                 this.toStringPokemon();
                break;
            case 2:
                PokemonName="Torchic";
                 this.toStringPokemon();
                break;
            default:
                PokemonName="Mudkip";
                this.toStringPokemon();
                break; 
        }
       
    
    
    }
        
        if(Region.equalsIgnoreCase("Sinnoh")){
        
       PokemonNum= mygenerator.nextInt(3)+1;
        switch (PokemonNum) {
            case 1:
                PokemonName="Turtwig";
                 this.toStringPokemon();
                break;
            case 2:
                PokemonName="Chimchar";
                 this.toStringPokemon();
                break;
            default:
                PokemonName="Piplup";
                 this.toStringPokemon();
                break;
        }
       
    
    
    }
        
        if(Region.equalsIgnoreCase("Unova")){
        
       PokemonNum= mygenerator.nextInt(3)+1;
        switch (PokemonNum) {
            case 1:
                PokemonName="Snivy";
                 this.toStringPokemon();
                break;
            case 2:
                PokemonName="Tepig";
                 this.toStringPokemon();
                break;
            default:
                PokemonName="Oshawott";
                 this.toStringPokemon();
                break;
        }
       
    
    
    }
        
        if(Region.equalsIgnoreCase("Kalos")){
        
       PokemonNum= mygenerator.nextInt(3)+1;
        switch (PokemonNum) {
            case 1:
                PokemonName="Chespin";
                 this.toStringPokemon();
                break;
            case 2:
                PokemonName="Fennekin";
                 this.toStringPokemon();
                break;
            default:
                PokemonName="Froakie";
                 this.toStringPokemon();
                break;
        }
       
    
    
    }
    
        if(Region.equalsIgnoreCase("Alola")){
        
       PokemonNum= mygenerator.nextInt(3)+1;
        switch (PokemonNum) {
            case 1:
                PokemonName="Rowlet";
                 this.toStringPokemon();
                break;
            case 2:
                PokemonName="Litten";
                 this.toStringPokemon();
                break;
            default:
                PokemonName="Popplio";
                 this.toStringPokemon();
                break;
        }
       
   
    
    }
    
    }
    
    public String toStringPokemon(){
    
    System.out.println("The pokemon you sould pick for the "+Region+" is "+PokemonName+".");
    
    return "Hi";
    
    }
}
