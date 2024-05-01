import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PCStrore {
    public static void main(String[] args) {

        PC newPc = new PC();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Q to quit");
       
        while(true)
        {
            Manager manager = null;
            
            String command;
            System.out.println("Press O to start order\nPress E to end order");
            String option;
            command = scanner.next();

            if(command.equalsIgnoreCase("O"))
            {
                while(true)
                {
                    System.out.println("Select PC\n(1)Gaming\n(2)PC 1\n(3)PC 2\n(4)PC 3");
                    option =scanner.next();

                    if(option.equalsIgnoreCase("e"))
                    {
                        System.out.println("You have to order atleast one item.");
                    }

                    if(option.equalsIgnoreCase("o"))
                    {
                        System.out.println("Add something in the previous order");
                    }

                    if(option.equalsIgnoreCase("1") || option.equalsIgnoreCase("2") || option.equalsIgnoreCase("3") || option.equalsIgnoreCase("1"))
                    {
                        int i = Integer.parseInt(option);
                        manager = new Manager(i);
                        break;
                    }
                }

                
                while(true)
                {
                    System.out.println("Add extra component");
                    System.out.println("(1)RAM 8 GB 2666 Mhz\n(2)8 GB 32000 Mhz\n(3)Graphics Card 2GB\n(4)Graphics Card 4 GB\n(E)Exit");
                    
                    option = scanner.next();

                    if(option.equalsIgnoreCase("e"))
                    {
                        break;
                    }

                    if(option.equalsIgnoreCase("o"))
                    {
                        System.out.println("Add something in the previous order");
                    }

                    if(option.equalsIgnoreCase("1") || option.equalsIgnoreCase("2") || option.equalsIgnoreCase("3") || option.equalsIgnoreCase("1"))
                    {
                        int i = Integer.parseInt(option);
                        manager.add(i);
                    }

                }

            }

            if(manager != null)
            {
                newPc = manager.getPC();
                newPc.print();
            }

            if(command.equalsIgnoreCase("Q"))
            {
                break;
            }

        }

    }
    
}
