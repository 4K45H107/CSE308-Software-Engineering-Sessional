package composite;

import java.util.ArrayList;


public class company{
    
    String name;

    ArrayList<Employee> managers = new ArrayList<>();

    public company(String name)
    {
        this.name = name;
    }

   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Employee> getManagers() {
        return managers;
    }


    public void addMan(Employee man)
    {
        managers.add(man);
    }


    public void removeMan(Employee man)
    {
        for(Employee emp : managers)
        {
            if(emp.getName().equalsIgnoreCase(man.getName()))
            {
                for(Employee empl : emp.getDevs())
                {
                    emp.removeDev(empl);
                }
                managers.remove(man);
                System.out.println(man.getName() + " is removed.");
            }
        }

    }

    
}
