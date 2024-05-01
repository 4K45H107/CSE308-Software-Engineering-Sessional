package state;

import java.util.Scanner;

public class initialState extends state{
    public initialState(vendingMachine vendingMachine) {
        super(vendingMachine);
    }

    public static final Scanner scanner = new Scanner(System.in);


    @Override
    public void handleMoney() {
        int price = vendingMachine.getProductPrice();
        System.out.println("Enter " + price + "tk to buy goods.");

        int inputMoney;
        inputMoney = scanner.nextInt();
        vendingMachine.setCurrentMoney(inputMoney);

        if(inputMoney == price)
        {
            vendingMachine.state.giveProduct();
        }

        else if(inputMoney > 50)
        {
            vendingMachine.changeState(vendingMachine.extra);
        }

        else if(inputMoney < 50)
        {
            vendingMachine.changeState(vendingMachine.less);
        }

    }

    @Override
    void run() {
        handleMoney();
    }
    
}
