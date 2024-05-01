public class BlackCoffee extends Beverage {

    public BlackCoffee()
    {
        type = "Black Coffee";
    }

    @Override
    public int cost() {
        int mugCost = 100;
        int waterCost = 0;
        int grindCost = 30;
        int totalCost = waterCost + grindCost + mugCost;

        return totalCost ;
    }
    
}
