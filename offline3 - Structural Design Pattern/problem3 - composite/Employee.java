package composite;

import java.util.ArrayList;

public interface Employee {
    void setName(String name);
    String getName();
    void setRole(String role);
    String getRole();
    void addDev(Employee dev);
    void removeDev(Employee dev);
    String getProjectName();
    ArrayList<Employee> getDevs();
    
}
