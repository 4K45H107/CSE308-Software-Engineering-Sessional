import java.util.Scanner;

public class PCStrore {
    public static void main(String[] args) {

        Burger newPc = new Burger();
        
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
                Manager manager = new Manager();

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
