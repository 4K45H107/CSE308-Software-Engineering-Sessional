import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class PC {

    //NAME
    String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //COMPONETS
    component processor = new component();
    component CPU = new component();
    component motherBoard = new component();
    component hardDisk = new component();
    component Cooler = new component();
    component externalDrive= new component();
    ArrayList<component> RAM = new ArrayList<>();
    ArrayList<component> graphicsCard = new ArrayList<>();

    component graphicscard= new component();
    component ram= new component();
    
    int baseComponentPrice = 70000;
    int basePrice = 0;
    int totalPrice = 0;

    //CONSTRUCTOR BASE
    public PC()
    {
        addBaseElement();
    }


    public void addBaseElement()
    {
        CPU.setType("Regular");
        motherBoard.setType("Regular");
        hardDisk.setType("1TB Hard Disk");
        basePrice += 70000;
        totalPrice += 70000;
    }

    //PRICE CALCULATION
    public void addAllPrice(int price)
    {
        basePrice += price;
        totalPrice += price;
    }

    public void addTotalPrice(int price)
    {
        totalPrice += price;
    }

    //GETTER
    public int getBasePrice() {
        return basePrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void print()
    {
        System.out.println("Name: " + this.name);
        System.out.println("BaseComponets - ");
        System.out.println("CPU: " + this.CPU.getType());
        System.out.println("Motherboard: " + this.motherBoard.getType());
        System.out.println("Hard disk: " + this.hardDisk.getType());

        if(this.Cooler.getType() != "")
        {
            System.out.println("Cooler: " + this.Cooler.getType());
        }

        if(this.externalDrive.getType() != "")
        {
            System.out.println("External Drive: " + this.externalDrive.getType());
        }

        int count = 0;
        int r = 0;
        int g = 0;
        
        for(component x: RAM)
        {
            if(count == 0)
            {
                System.out.println("Added components -");
            }
            count++;
            r++;
            System.out.println("RAM: " + x.getType());

        }

        for(component x: graphicsCard)
        {
            if(count == 0)
            {
                System.out.println("Added components -");
            }
            count++;
            g++;
            System.out.println("Graphics Card: " + x);
        }

        System.out.println("Base Price: " + this.getBasePrice());
        System.out.println("Total Price: " + this.getTotalPrice());

        if(r != 0 || g != 0)
        {
            if(r == 0)
            {
                System.out.println("Price incread because of adding graphics card");
            }

            else if(g == 0)
            {
                System.out.println("Price incread because of adding RAM");
            }
            
            else 
            {
                System.out.println("Price increased because of adding ram and graphics card");
            }
        }
    }

}

class component {

    String type;
    int price;

    public component()
    {
        this.type = "";
        this.price = 0;
    }

    public component(String type, int price)
    {
        this.type = type;
        this.price = price;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
