package observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        ABC abc = new ABC();
        
        user premiumUser = new premiumUser();
        abc.subscribe(premiumUser, "premium");
        
        user regulaUser = new regularUser();
        abc.subscribe(regulaUser, "regular");

        while(true)
        {
            System.out.println("1. Operational");
            System.out.println("2. Partially down");
            System.out.println("3. Fully down");

            option = scanner.nextInt();
            
            if(option == -1)
            {
                break;
            }
            
            abc.notifyUser(option);

        }
        scanner.close();
    }
}
