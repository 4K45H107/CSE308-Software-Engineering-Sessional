package adapter;

public class imposter implements badPeople
{

    String name = null;

    public imposter(String name)
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
    public void sabotage() 
    {
        System.out.println(this.name + " secretly planning to destroy the ship");
    }
    
}
