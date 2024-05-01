package state;

public class vendingMachine{
    int productPrice = 50;
    int  currentMoney = 0;
    int totalCount = 0;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    state state;
    state initial;
    state extra;
    state less;

    public vendingMachine(int total)
    {
        this.state = new initialState(this);
        this.initial = new initialState(this);
        this.less = new lessMoney(this);
        this.extra = new extraMoney(this);
        this.totalCount = total;
        this.state.run();
    }

    public void changeState(state state)
    {
        this.state = state;
        if(this.totalCount == 0)
        {
            System.out.println("All product sold!");
        }
        else{
            this.state.run();
        }
        
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }


}