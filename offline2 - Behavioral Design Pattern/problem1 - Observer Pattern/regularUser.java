package observer;

import java.util.Scanner;

public class regularUser implements user{
    public static final Scanner scanner = new Scanner(System.in);
    boolean newService = false;

    @Override
    public void operationalToPartialDown() {
        System.out.print("Regular: ");
        System.out.println("State is changed to partially down. Do you want to use additional service?");
        System.out.println("1. Pay 20 dollar per hour to enjoy full service.");
        System.out.println("2. Continue using limited service.");
        int option;
        option = scanner.nextInt();

        if(option == 1)
        {
            newService = true;
        }

        if(option == 1)
        {
            System.out.println("Your datas are coppied to DEF server");
        }
    }

    @Override
    public void operationalToFullyDown() {
        System.out.print("Regular: ");
        System.out.println("State is changed to fully down. Do you want to pay 20 dollar per hour to enjoy full service?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int option;
        option = scanner.nextInt();

        if(option == 1)
        {
            newService = true;
        }

        if(option == 1)
        {
            System.out.println("Your datas are coppied to DEF server");
        }
    }

    @Override
    public void partiallyDownToOperational() {
        System.out.print("Regular: ");
        System.out.println("State changed to operational.");
        if(newService == true)
        {
            System.out.println("Total bill since last state change 120$");
            this.newService = false;
        }
    }

    @Override
    public void partiallyDownToFullyDown() {
        System.out.print("Regular: ");
        System.out.println("State changed to fully down.");
    }

    @Override
    public void fullyDownToOperational() {
        System.out.print("Regular: ");
        System.out.println("State changed to operational");
        if(newService == true)
        {
            System.out.println("Total bill since last state change 120$");
            this.newService = false;
        }
    }

    @Override
    public void fullyDownToPartiallyDown() {
        System.out.print("Regular: ");
        System.out.println("State changed to partially down");
    }
    
}
