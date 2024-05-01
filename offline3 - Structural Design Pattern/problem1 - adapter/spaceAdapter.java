package adapter;

public class spaceAdapter implements goodPeople
{
    imposter imposters;

    public spaceAdapter(imposter imposters)
    {
        this.imposters = imposters;
    }

    @Override
    public void contribute() 
    {
        imposters.sabotage();
    }
    
}
