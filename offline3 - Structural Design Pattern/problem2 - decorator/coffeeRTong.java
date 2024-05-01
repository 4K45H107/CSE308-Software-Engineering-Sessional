import java.util.Scanner;

public class coffeeRTong 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String command;
        int totalCost = 0;
        
        System.out.println("Press O to start order\nPress E to end order");
        
        String option;
        
        command = scanner.next();

        if(command.equalsIgnoreCase("O"))
        {
            Beverage coffee;
            String name;

            while(true)
            {
                System.out.println("Menu Card");
                System.out.println("1. Americano");
                System.out.println("2. Espresso");
                System.out.println("3. Cappuchino");
                System.out.println("4. Mocha");

                option = scanner.next();
                int i = Integer.parseInt(option);

                if(i == 1)
                {
                    name = "Americano";
                    coffee = new BlackCoffee();
                    coffee = new grindBean(coffee);
                }

                else if(i == 2)
                {
                    name = "Espresso";
                    coffee = new BlackCoffee();
                    coffee = new dairyCream(coffee);
                }

                else if(i == 3)
                {
                    name = "Cappuchino";
                    coffee = new MilkCoffee();
                    coffee = new cinamonPowder(coffee);
                }

                else if(i == 4)
                {
                    name = "Mocha";
                    coffee = new MilkCoffee();
                    coffee = new chocolateSauce(coffee);
                }

                else 
                {
                    continue;
                }

                while(true)
                {

                    System.out.println("Add extra component");
                    System.out.println("(1)Dairy Cream\n(2)Cinamon Powder\n(3)Chocolate Sauce\n(4)Grind Bean\n(O)New Order\n(Q)Quit");
                    
                    option = scanner.next();

                    if(option.equalsIgnoreCase("q"))
                    {
                        System.out.println(name + " --- " + coffee.getType() + " : " + coffee.cost());
                        totalCost += coffee.cost();
                        System.out.println("Total cost : " + totalCost);
                        return;
                    }

                    if(option.equalsIgnoreCase("o"))
                    {
                        System.out.println(name + " --- " + coffee.getType() + " : " + coffee.cost());
                        totalCost += coffee.cost();
                        break;
                    }

                    if(option.equalsIgnoreCase("1") || option.equalsIgnoreCase("2") || option.equalsIgnoreCase("3") || option.equalsIgnoreCase("4"))
                    {
                        int opt = Integer.parseInt(option);

                        if(opt == 1)
                        {
                            coffee = new dairyCream(coffee);
                        }

                        else if(opt == 2)
                        {
                            coffee = new cinamonPowder(coffee);
                        }

                        else if(opt == 3)
                        {
                            coffee = new chocolateSauce(coffee);
                        }

                        else if(opt == 4)
                        {
                            coffee = new grindBean(coffee);
                        }

                        else 
                        {
                            continue;
                        }
                    }

                }

            }

        }

        System.out.println("Total cost : " + totalCost);


    }
}
