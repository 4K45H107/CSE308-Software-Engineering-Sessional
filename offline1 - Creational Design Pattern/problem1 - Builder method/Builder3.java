public class Builder3 implements iBuilder{
    
    PC pc = new PC();
    
    @Override
    public void addName() {
        pc.setName("PC 2");
    }

    @Override
    public void addProcessor() {
        pc.processor = new component("Intel core i7", 37000);
        pc.addAllPrice(37000);
    }

    @Override
    public void addExtraElements() {
        pc.Cooler = new component("Liquid cooler", 17000);
        pc.addAllPrice(17000);
    }


    public PC getPc()
    {
        return this.pc;
    }

    public void addRam(String name, int price)
    {
        pc.ram = new component(name, price);
        pc.RAM.add(pc.ram);
        pc.addTotalPrice(price);
    }

    public void addGraphicsCard(String name, int price)
    {
        pc.graphicscard = new component(name, price);
        pc.graphicsCard.add(pc.graphicscard);

        pc.addTotalPrice(price);
    }
}


