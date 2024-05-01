package composite;

import java.util.ArrayList;

public class ProjectManager implements Employee{

    String name;
    String projectName;
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    String role = "ProjectManager";

    ArrayList<Employee> developers =  new ArrayList<>();

    public ProjectManager(String name, String projectName) {
        this.name = name;
        this.projectName = projectName;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    public void addDev(Employee dev)
    {
        developers.add(dev);
    }

    public void removeDev(Employee dev)
    {
        for(Employee emp : developers)
        {
            if(emp.getName().equalsIgnoreCase(dev.getName()))
            {
                developers.remove(dev);
                System.out.println(dev.getName() + " is removed.");
            }
        }
    }

    

    public ArrayList<Employee> getDevs()
    {
        return this.developers;
    }
    
}
