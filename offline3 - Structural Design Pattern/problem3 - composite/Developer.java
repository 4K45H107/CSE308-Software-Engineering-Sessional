package composite;

import java.util.ArrayList;

public class Developer implements Employee  {


    String name;
    String role = "Developer";
    Employee projectManager;




    public Developer(Employee projectManager, String name)
    {
        this.name = name;
        this.projectManager = projectManager;
    }




    @Override
    public void setName(String name) 
    {
        this.name = name;
    }

    @Override
    public String getName() 
    {
        return this.name;
    }

    @Override
    public void setRole(String role) 
    {
        this.role = role;
    }

    @Override
    public String getRole() 
    {
        return this.role;
    }


    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }


    @Override
    public void addDev(Employee dev) {
        
    }




    @Override
    public String getProjectName() {
        return projectManager.getProjectName();
    }




    @Override
    public void removeDev(Employee dev) {
        // TODO Auto-generated method stub
        
    }




    @Override
    public ArrayList<Employee> getDevs() {
        // TODO Auto-generated method stub
        return null;
    }

    


    
}
