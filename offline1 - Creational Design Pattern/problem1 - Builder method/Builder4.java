public class Builder4 implements iBuilder{
    PC pc = new PC();

    
    @Override
    public void addName() {
        pc.setName("PC 3");
    }
    
    @Override
    public void addProcessor() {
        pc.processor = new component("Intel core i9", 65000);
        pc.addAllPrice(65000);
    }
    
    @Override
    public void addExtraElements() {
        pc.externalDrive = new component("DVD Drive", 6000);
        pc.addAllPrice(6000);
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
