package adapter;

public class crewmate implements goodPeople 
{
    String name = null;

    public crewmate(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void contribute() 
    {
        System.out.println(this.name + " contributed to improve the ship");
    }
    
}
