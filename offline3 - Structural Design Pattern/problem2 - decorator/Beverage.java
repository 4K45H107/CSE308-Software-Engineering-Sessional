public abstract class Beverage 
{
    String type; 

    Beverage()
    {
        this.type = "Unknown";
    }

    public String getType() 
    {
        return this.type;
    }

    public abstract int cost();
}