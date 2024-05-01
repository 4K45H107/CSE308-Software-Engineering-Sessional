public class chocolateSauce extends CondimentDecorator
{

    Beverage beverage;

    public chocolateSauce(Beverage beverage) 
    {
        this.beverage = beverage;
    }

    @Override
    public String getType() 
    {
        return this.beverage.getType() + ", Chocolate Sauce";
    }

    @Override
    public int cost() 
    {
        int cost;
        cost = this.beverage.cost() + 60;
        return cost;
    }
    
}
