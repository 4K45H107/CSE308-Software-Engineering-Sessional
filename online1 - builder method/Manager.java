public class Manager {

    iBuilder builder = null;
    
    public Manager()
    {
        builder = new Builder1();
        
        if(builder != null)
        {
            builder = new Builder1();
        }
    }

    public void add(int option)
    {
        if(option == 1)
        {
           
            builder.addCheese();
        }
        else if(option == 2)
        {
            builder.addPatty();
        }

        else if(option == 3)
        {
            builder.addBBQ();
        }

        else if(option == 4)
        {
            builder.addSalad();
        }
    }

    public Burger getPC()
    {
        return builder.getBurger();
    } 

}
