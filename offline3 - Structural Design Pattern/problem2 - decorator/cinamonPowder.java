public class cinamonPowder extends CondimentDecorator 
{
    Beverage beverage;

    public cinamonPowder(Beverage beverage) 
    {
        this.beverage = beverage;
    }

    @Override
    public String getType() 
    {
        return this.beverage.getType() + ", Cinamon Powder";
    }

    @Override
    public int cost() 
    {
        int cost;
        cost = this.beverage.cost() + 50;
        return cost;
    }
    
}
