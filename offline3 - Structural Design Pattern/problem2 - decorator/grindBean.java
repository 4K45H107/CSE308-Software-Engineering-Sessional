public class grindBean extends CondimentDecorator
{

    Beverage beverage;

    public grindBean(Beverage beverage) 
    {
        this.beverage = beverage;
    }

    @Override
    public String getType() 
    {
        return this.beverage.getType() + ", Grind Bean";
    }

    @Override
    public int cost() 
    {
        int cost;
        cost = this.beverage.cost() + 30;
        return cost;
    }
    
}
