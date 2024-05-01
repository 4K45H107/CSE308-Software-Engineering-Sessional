package online;

import java.util.Scanner;

public class Deviceshop {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        while(true)
                {
                    System.out.println("(1)Smartphone\n(2)Notebook computer\n");

                    int option;
                    
                    option = scanner.nextInt();

                    if(option == 1)
                    {
                        System.out.println("Choose operating system");
                        System.out.println("1. Windows \n 2. Linux");

                        int opt = scanner.nextInt();
                        if(opt == 1)
                        {
                            Device device = new SmartPhones(new Windows());
                        }

                        else
                        {
                            Device device = new SmartPhones(new Linux());
                        }
                    }

                    else{
                        System.out.println("Choose operating system");
                        System.out.println("1. Windows \n 2. Linux");

                        int opt = scanner.nextInt();
                        if(opt == 1)
                        {
                            Device device = new Notebook(new Windows());
                        }

                        else
                        {
                            Device device = new Notebook(new Linux());
                        }
                    }

                }

    }
    
}
