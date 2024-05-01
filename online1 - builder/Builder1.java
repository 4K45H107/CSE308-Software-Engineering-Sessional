public class Builder1 implements iBuilder{

    Burger pc = new Burger();

    public void addPatty()
    {
        pc.extrapatty = new component("Patty", 80);
        pc.extraPatty.add(pc.extrapatty);
        pc.addTotalPrice(80);
    }

    public void addCheese()
    {
        pc.cheese = new component("Cheese", 30);
        pc.cHeese.add(pc.cheese);
        pc.addTotalPrice(30);
    }

    public void addBBQ()
    {
        pc.bbqsausage = new component("BBQ Sausage", 20);
        pc.bbqSausage.add(pc.bbqsausage);
        pc.addTotalPrice(20);
    }

    public void addSalad()
    {
        pc.salad = new component("Salad", 10);
        pc.sAlad.add(pc.salad);
        pc.addTotalPrice(10);
    }

    @Override
    public Burger getBurger() {
        return this.pc;
    }

    
}
