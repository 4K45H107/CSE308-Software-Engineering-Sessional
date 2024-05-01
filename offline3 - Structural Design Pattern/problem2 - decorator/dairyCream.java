public class dairyCream extends CondimentDecorator
{

    Beverage beverage;

    public dairyCream(Beverage beverage) 
    {
        this.beverage = beverage;
    }

    @Override
    public String getType() 
    {
        return this.beverage.getType() + ", Dairy Cream";
    }

    @Override
    public int cost() 
    {
        int cost;
        cost = this.beverage.cost() + 40;
        return cost;
    }
}
