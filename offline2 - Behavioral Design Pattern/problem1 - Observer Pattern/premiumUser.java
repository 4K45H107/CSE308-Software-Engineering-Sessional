package observer;

import java.util.Scanner;

public class premiumUser implements user{
    public static final Scanner scanner = new Scanner(System.in);

    @Override
    public void operationalToPartialDown() {
        System.out.print("Premium: ");
        System.out.println("State is changed to partially down. Do you want to use service from two servers?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int option;
        option = scanner.nextInt();

        if(option == 1)
        {
            System.out.println("You are getting service from two servers.");
        }
    }

    @Override
    public void operationalToFullyDown() {
        System.out.print("Premium: ");
        System.out.println("State changed to fully down. Service is now provided by our partner DEF company");
    }

    @Override
    public void partiallyDownToOperational() {
        System.out.print("Premium: ");
        System.out.println("State changed to operational.");
    }

    @Override
    public void partiallyDownToFullyDown() {
        System.out.print("Premium: ");
        System.out.println("State changed to fully down. All the services shifted to the server of DEF.");
    }

    @Override
    public void fullyDownToOperational() {
        System.out.print("Premium: ");
        System.out.println("State changed to operational");
    }

    @Override
    public void fullyDownToPartiallyDown() {
        System.out.print("Premium: ");
        System.out.println("State changed to partially down");
    }
    
}
 