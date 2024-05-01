package adapter;

public class spaceship {
    public static void main(String[] args) 
    {
        crewmate crewmates = new crewmate("Akash");

        imposter imposters = new imposter("Hafijul");

        goodPeople spaceAdapter = new spaceAdapter(imposters);

        crewmates.contribute();
        imposters.sabotage();
        spaceAdapter.contribute();
    }
}
