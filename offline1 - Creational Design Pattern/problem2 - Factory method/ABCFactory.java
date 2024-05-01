import java.util.Scanner;

public class ABCFactory { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            String continent;

            System.out.println("**** Welcome to ABC Factory ****");
            System.out.println();
            System.out.println("Available cars: ");
            System.out.println("(1) Toyota ");
            System.out.println("(2) BMW ");
            System.out.println("(3) Tesla ");
            System.out.println();
            System.out.println("Press Q to quit");
            System.out.print("Enter your continent: ");

        
            continent = scanner.nextLine();

            if(continent.equalsIgnoreCase("Q"))
            {
                System.out.println("The program is closed.");
                break;
            }
    
            System.out.println();
    
            factory carFactory = new factory();
            cars newCar = carFactory.getCar(continent);

            if(newCar != null)
            {
                newCar.printCar();
            }
            
        }

        scanner.close();
    }
}
