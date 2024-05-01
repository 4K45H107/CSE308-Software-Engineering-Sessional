package observer;

import java.util.ArrayList;

public class ABC implements baseCompany{
    //operational = 1
    //partially down = 2
    //fully down = 3 
    int previous = 1; //initially operational
    int current = 1;

    ArrayList<user> premiumUsers = new ArrayList<>();
    ArrayList<user> regularUsers = new ArrayList<>();

    @Override
    public void subscribe(user user, String type)
    {
        if(type.equalsIgnoreCase("premium"))
        {
            premiumUsers.add(user);
        }
        else if(type.equalsIgnoreCase("regular"))
        {
            premiumUsers.add(user);
        }
    }

    @Override
    public void unSubscribe()
    {

    }

    @Override
    public void notifyUser(int option)
    {
        this.current = option;
        if(previous == current)
        {
            System.out.println("Already in the same state");
        }

        if(previous == 1 && current == 2)
        {
            for(user us : premiumUsers)
            {
                us.operationalToPartialDown();
            }
            for(user us : regularUsers)
            {
                us.operationalToPartialDown();
            }
        }

        else if(previous == 1 && current == 3)
        {
            for(user us : premiumUsers)
            {
                us.operationalToFullyDown();
            }
            for(user us : regularUsers)
            {
                us.operationalToFullyDown();
            }
        }

        else if(previous == 2 && current == 1)
        {
            for(user us : premiumUsers)
            {
                us.partiallyDownToOperational();
            }
            for(user us : regularUsers)
            {
                us.partiallyDownToOperational();
            }
        }

        else if(previous == 2 && current == 3)
        {
            for(user us : premiumUsers)
            {
                us.partiallyDownToFullyDown();
            }
            for(user us : regularUsers)
            {
                us.partiallyDownToFullyDown();
            }
        }

        else if(previous == 3 && current == 1)
        {
            for(user us : premiumUsers)
            {
                us.fullyDownToOperational();
            }
            for(user us : regularUsers)
            {
                us.fullyDownToOperational();
            }
        }

        else if(previous == 3 && current == 2)
        {
            for(user us : premiumUsers)
            {
                us.fullyDownToPartiallyDown();
            }
            for(user us : regularUsers)
            {
                us.fullyDownToPartiallyDown();
            }
        }

        this.previous = this.current;

    }

}
