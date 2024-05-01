package state;

abstract class state {
    vendingMachine vendingMachine;

    public state(vendingMachine vendingMachine)
    {
        this.vendingMachine = vendingMachine;
    }
    
    public void giveProduct()
    {
        System.out.println("Your good is given.");
        vendingMachine.setTotalCount(vendingMachine.getTotalCount() - 1);
        vendingMachine.changeState(vendingMachine.initial);
    }

    abstract void handleMoney();
    abstract void run();
}
