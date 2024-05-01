import java.util.ArrayList;

public class Burger {


    //COMPONETS
    component Bun = new component("Regular",20);
    component Patty = new component("Regular",80);

    ArrayList<component> extraPatty = new ArrayList<>();
    ArrayList<component> cHeese  = new ArrayList<>();
    ArrayList<component> bbqSausage  = new ArrayList<>();
    ArrayList<component> sAlad  = new ArrayList<>();
    
    component extrapatty = new component(); 
    component cheese= new component();
    component bbqsausage= new component();
    component salad= new component();

    
    int baseComponentPrice = 120;
    int basePrice = 0;
    int totalPrice = 0;

    public Burger()
    {
        this.basePrice+= 120;
        this.totalPrice+=120;

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
        System.out.println("BaseComponets - ");
        System.out.println("Bun: " + this.Bun.getType());
        System.out.println("Patty: " + this.Patty.getType());


        int count = 0;
        
        for(component x: extraPatty)
        {
            if(count == 0)
            {
                System.out.println("Added components -");
            }
            count++;
            System.out.println("Extra Patty: " + x.getType());

        }

        for(component x: cHeese)
        {
            if(count == 0)
            {
                System.out.println("Added components -");
            }
            count++;
            System.out.println("Cheese: " + x);
        }

        for(component x: bbqSausage)
        {
            if(count == 0)
            {
                System.out.println("Added components -");
            }
            count++;
            System.out.println("BBQ Sausage: " + x);
        }

        for(component x: sAlad)
        {
            if(count == 0)
            {
                System.out.println("Added components -");
            }
            count++;
            System.out.println("Salad: " + x);
        }

        System.out.println("Base Price: " + this.getBasePrice());
        System.out.println("Total Price: " + this.getTotalPrice());
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
