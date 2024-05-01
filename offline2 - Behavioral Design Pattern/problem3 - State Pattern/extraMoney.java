package state;

public class extraMoney extends state{

    public extraMoney(vendingMachine vendingMachine) {
        super(vendingMachine);
    }

    int extraMoney;


    @Override
    void handleMoney() {
        System.out.println("Extra money " + extraMoney + " given to you.");
        vendingMachine.state.giveProduct();
    }

    @Override
    void run() {
        this.extraMoney = vendingMachine.currentMoney - vendingMachine.productPrice;
        handleMoney();
    }
}
