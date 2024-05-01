public class Manager {

    iBuilder builder = null;
    
    public Manager(int type)
    {
        
        if(type == 1)
        {
            builder = new Builder1();
        }

        else if(type == 2)
        {
            builder = new Builder2();
        }

        else if(type == 3)
        {
            builder = new Builder3();
        }

        else if(type == 4)
        {
            builder = new Builder4();
        }
        
        if(builder != null)
        {
            builder.addName();
            builder.addExtraElements();
            builder.addProcessor();
        }
    }

    public void add(int option)
    {
        if(option == 1)
        {
           
            builder.addRam("8 GB DDR4 2666 Mhz", 2620);
        }
        else if(option == 2)
        {
            builder.addRam("8 GB DDR4 3250 Mhz", 2950);
        }

        else if(option == 3)
        {
            builder.addGraphicsCard("2 GB graphics", 6500);
        }

        else if(option == 4)
        {
            builder.addGraphicsCard("4 GB graphics", 7600);
        }
    }

    public PC getPC()
    {
        return builder.getPc();
    } 

}
