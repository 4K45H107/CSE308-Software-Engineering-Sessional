package composite;

import java.util.ArrayList;
import java.util.Scanner;

public class siliconValley {    
    public static void main(String[] args) {

            ArrayList <company> companies = new ArrayList<>();

            while(true) 
            {

                System.out.println("1. Create a Company");
                System.out.println("2. Assign a Project Manager");
                System.out.println("3. Assign a Developer");
                System.out.println("4. Remove company");
                System.out.println("5. Remove project manager");
                System.out.println("6. Remove developer");
                System.out.println("7. Display company hiearcy");
                System.out.println("8. Display Manager details");

                Scanner scanner = new Scanner(System.in);
                
                String option = scanner.next();
                int i = Integer.parseInt(option);


                if (i == 1) 
                {
                    System.out.println("Enter the company name : ");
                    String compName = scanner.next();

                    company temp = null;

                    for(company company : companies)
                    {
                        if(company.getName().equalsIgnoreCase(compName))
                        {
                            System.out.println("Already a company with same name.");
                        }
                    }

                    if(temp == null)
                    {
                        company softwareFirm = new company(compName);
                        companies.add(softwareFirm);
                        
                        System.out.println(softwareFirm.getName() + " is created");
                    }
                    
                }
                else if (i == 2) 
                {
                    
                    int size = companies.size();

                    if (size == 0) 
                    {
                        System.out.print("No company in Silicon Valley. ");
                        System.out.println("At first create a company then add project manager");
                    } 

                    else 
                    {
                        System.out.println("Enter company name :");
                        
                        String name = scanner.next();
                        
                        int comp = 0;

                        for (company company : companies) 
                        {
                            if (company.getName().equalsIgnoreCase(name)) 
                            {
                                
                                comp++;

                                String manName, proName;
                                
                                System.out.println("Enter manager name : ");
                                manName = scanner.next();

                                System.out.println("Enter project name : ");
                                proName = scanner.next();

                                Employee projectManager = new ProjectManager((manName), proName);
                                
                                company.addMan(projectManager);
                            }
                        }

                        if(comp == 0)
                        {
                            System.out.println("No company name is matched");
                        }
                    }
                }

                else if (i == 3) 
                {

                    int size = companies.size();

                    if (size == 0)
                    {
                        System.out.print("No company in Silicon Valley. ");
                        System.out.println("At first create a company then add developer");
                    } 
                    else 
                    {
                        System.out.println("Enter Company name :");
                        String compName = scanner.next();
                        
                        company temp = null;
                        int comp = 0;

                        for (company company : companies) {
                            if (company.getName().equals(compName)) 
                            {
                                temp = company;
                                comp++;
                            }
                        }

                        if (comp == 0) 
                        {
                            System.out.println("No company with this name");
                        } 
                        else 
                        {
                            System.out.println("Enter manager name : ");

                            String manName = scanner.next();
                            Employee tempPro = null;

                            for (Employee emp : temp.getManagers()) {
                                if (emp.getName().equalsIgnoreCase(manName)) 
                                {
                                    
                                    tempPro = emp;
                                }
                            }

                            if (tempPro == null) 
                            {
                                System.out.println("No manager in this name");
                            } 
                            else 
                            {
                                System.out.println("Enter Developer name : ");
                                String dev = scanner.next();
                                
                                Developer developer = new Developer(tempPro, dev);
                                System.out.println("Developer is added");

                                tempPro.addDev(developer);
                            }
                        }
                    }

                }

                else if (i == 4) 
                {

                    int size = companies.size();

                    if (size == 0)
                    {
                        System.out.print("No company in Silicon Valley. ");
                        System.out.println("At first create a company then add developer");
                    } 
                    else 
                    {
                        System.out.println("Enter company name :");

                        String compName = scanner.next();
                        company temp = null;
                        int comp = 0;

                        for (company company : companies) {
                            if (company.getName().equals(compName)) 
                            {
                                temp = company;
                                comp++;
                            }
                        }

                        if (comp == 0) 
                        {
                            System.out.println("No company with this name");
                        } 

                        else
                        {
                            for(Employee emp : temp.managers)
                            {
                                temp.managers.remove(emp);
                                temp.removeMan(emp);
                                System.out.println(emp.getName() + " is removed.");
                            }

                        }
                    }
                

            }

            else if (i == 5) 
            {

                int size = companies.size();

                    if (size == 0) 
                    {
                        System.out.print("No company in Silicon Valley.");
                    } 

                    else 
                    {
                        System.out.println("Enter company name :");
                        
                        String name = scanner.next();
                        
                        int comp = 0;

                        for (company company : companies) 
                        {
                            if (company.getName().equalsIgnoreCase(name)) 
                            {
                                
                                comp++;

                                String n = scanner.next();
                                int a = 0;

                                for(Employee emp : company.managers)
                                {
                                    a++;
                                    if(emp.getName().equalsIgnoreCase(n))
                                    {
                                        company.removeMan(emp);
                                    }
                                }

                                if(a == 0)
                                {
                                    System.out.println("No manager with this name.");
                                }
                            }
                        }

                        if(comp == 0)
                        {
                            System.out.println("No company name is matched");
                        }
                    }

            }

            else if (i == 6) 
                {

                    int size = companies.size();

                    if (size == 0)
                    {
                        System.out.print("No company in Silicon Valley. ");
                    } 
                    else 
                    {
                        System.out.println("Enter Company name :");
                        String compName = scanner.next();
                        
                        company temp = null;
                        int comp = 0;

                        for (company company : companies) {
                            if (company.getName().equals(compName)) 
                            {
                                temp = company;
                                comp++;
                            }
                        }

                        if (comp == 0) 
                        {
                            System.out.println("No company with this name");
                        } 
                        else 
                        {
                            System.out.println("Enter manager name : ");

                            String manName = scanner.next();
                            Employee tempPro = null;

                            for (Employee emp : temp.getManagers()) {
                                if (emp.getName().equalsIgnoreCase(manName)) 
                                {
                                    tempPro = emp;
                                }
                            }

                            if (tempPro == null) 
                            {
                                System.out.println("No manager in this name");
                            } 
                            else 
                            {
                                System.out.println("Enter Developer name : ");
                                String dev = scanner.next();
                                
                                for(Employee e : tempPro.getDevs())
                                {
                                    if(e.getName().equalsIgnoreCase(dev))
                                    {
                                        e.removeDev(e);
                                    }
                                }
                            }
                        }
                    }

                }

                else if(i == 8)
                {
                    int size = companies.size();

                    if (size == 0)
                    {
                        System.out.print("No company in Silicon Valley. ");
                    } 
                    else 
                    {
                        System.out.println("Enter Company name :");
                        String compName = scanner.next();
                        
                        company temp = null;
                        int comp = 0;

                        for (company company : companies) {
                            if (company.getName().equals(compName)) 
                            {
                                temp = company;
                                comp++;
                            }
                        }

                        if (comp == 0) 
                        {
                            System.out.println("No company with this name");
                        } 
                        else 
                        {
                            System.out.println("Enter manager name : ");

                            String manName = scanner.next();
                            Employee tempPro = null;

                            for (Employee emp : temp.getManagers()) {
                                if (emp.getName().equalsIgnoreCase(manName)) 
                                {
                                    tempPro = emp;
                                }
                            }

                            if (tempPro == null) 
                            {
                                System.out.println("No manager in this name");
                            } 
                            else 
                            {
                                System.out.println("Company name : " + compName);
                                System.out.print("Manager name : " + tempPro.getName() + " ");
                                System.out.println("(" + tempPro.getProjectName() + ")");
                                System.out.println("Developer count : " + tempPro.getDevs().size());

                            }
                        }
                    }
                }


        }
    }
}
