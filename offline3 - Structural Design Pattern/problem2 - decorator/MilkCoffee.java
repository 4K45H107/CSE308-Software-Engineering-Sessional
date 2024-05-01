public class MilkCoffee extends Beverage
{
    public MilkCoffee()
    {
        type = "Milk Coffee";
    }

    @Override
    public int cost() 
    {
        int mugCost = 100;
        int milkCost = 50;
        int grindCost = 30;
        int totalCost = milkCost + grindCost + mugCost;

        return totalCost;
    }
    
}
