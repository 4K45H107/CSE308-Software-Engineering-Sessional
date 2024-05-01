public class Builder1 implements iBuilder{

    PC pc = new PC();

    
    @Override
    public void addName() {
        pc.setName("Gaming");
    }

    @Override
    public void addProcessor() {
        pc.processor = new component("AMD ryzen 7 5700X", 28000);
        pc.addAllPrice(28000);
    }

    @Override
    public void addExtraElements() {

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

    public PC getPc()
    {
        return this.pc;
    }

    
}
