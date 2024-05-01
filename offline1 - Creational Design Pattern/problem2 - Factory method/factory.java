class factory {

    cars car; 

    public void buildCar(String location)
    {
        if(location == null)
        {
            car = null;
        }

        else if(location.equalsIgnoreCase("Asia"))
        {
            car = new toyota(); 
        }
    
        else if(location.equalsIgnoreCase("Europe"))
        {
            car = new BMW();
        }
    
        else if(location.equalsIgnoreCase("United States"))
        {
            car = new tesla(); 
        }
        
        else 
        {
            car = null;
        }
    }

    public cars getCar(String location)
    {
        buildCar(location);
        
        if(car == null)
        {
            System.out.println("Wronge location.");
            System.out.println();
        }

        return this.car;
    }

}
