package state;

import java.util.Scanner;

public class lessMoney extends state {

    public lessMoney(vendingMachine vendingMachine) {
        super(vendingMachine);
    }

    int moneyNeed;



    public static final Scanner scanner = new Scanner(System.in);

  

    @Override
    public void handleMoney() {
        System.out.println("You need to pay more " + moneyNeed + " money");
        int moneyIn = scanner.nextInt();
        
        if(moneyNeed == moneyIn)
        {
            vendingMachine.state.giveProduct();
        }

        else if(moneyNeed > moneyIn)
        {
            vendingMachine.setCurrentMoney(vendingMachine.currentMoney + moneyIn);
            vendingMachine.changeState(vendingMachine.less);
            
        }

        else if(moneyIn > moneyNeed)
        {
            vendingMachine.setCurrentMoney(vendingMachine.currentMoney + moneyIn);
            vendingMachine.changeState(vendingMachine.extra);
        }

    }

    @Override
    void run() {
        this.moneyNeed = vendingMachine.productPrice -  vendingMachine.currentMoney;
        handleMoney();
    }
    
}
