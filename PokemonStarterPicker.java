
import java.util.Scanner;

public class PokemonStarterPicker {

    public static void main(String[] args) {

        Boolean Over = false;
        String Region;
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Welcome to Pokemon starter picker.\n\nPlease Enter the Region.");

        Region = myscanner.nextLine();
        //Makes it so only proper regions can be entered
        while (!Region.equalsIgnoreCase("Kanto") && !Region.equalsIgnoreCase("Johto") && !Region.equalsIgnoreCase("Hoenn")
                && !Region.equalsIgnoreCase("Sinnoh") && !Region.equalsIgnoreCase("Unova") && !Region.equalsIgnoreCase("Kalos")
                && !Region.equalsIgnoreCase("Alola")) {

            System.out.println("\nPlease enter a valid region. ie(Kanto, Johto, Hoenn, Sinnoh, Unova, Kalos, Alola)");
            Region = myscanner.nextLine();

        }

        //runs until user is done
        Pokemon App = new Pokemon();
        while (Over == false) {

            App.setRegion(Region);

            System.out.println("\nPlease enter another Region or Type XXX to quit.");
            Region = myscanner.nextLine();
            //Makes it so only proper regions can be entered
            if (Region.equalsIgnoreCase("xxx")) {
                Over = true;
                System.out.println("Have A good day.");
                return;
            }
            while (!Region.equalsIgnoreCase("Kanto") && !Region.equalsIgnoreCase("Johto") && !Region.equalsIgnoreCase("Hoenn")
                    && !Region.equalsIgnoreCase("Sinnoh") && !Region.equalsIgnoreCase("Unova") && !Region.equalsIgnoreCase("Kalos")
                    && !Region.equalsIgnoreCase("Alola")&& !Region.equalsIgnoreCase("xxx")) {

                System.out.println("\nPlease enter a valid region ie(Kanto, Johto, Hoenn, Sinnoh, Unova, Kalos, Alola) or Type XXX to quit.");
                Region = myscanner.nextLine();
                if (Region.equalsIgnoreCase("xxx")) {
                    Over = true;
                    System.out.println("Have A good day.");
                    return;
                }

            }

        }

    }

}
