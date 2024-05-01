package mediator;

import java.util.Scanner;

public class student {
    int ID;
    int marks;
    examController examController;

    public examController getExamController() {
        return examController;
    }

    public void setExamController(examController examController) {
        this.examController = examController;
    }

    public static final Scanner scanner = new Scanner(System.in);

    public student()
    {
        this.ID = 0;
        this.marks = 0;
    }

    public student(int ID)
    {
        this.ID = ID;
        this.marks = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void printMarks()
    {
        System.out.println("Student ID: " + this.ID + " Marks: " + this.marks);
    }

    //exam controller to student
    public int recheckReq()
    {
        int option;
        option = scanner.nextInt();
        
        if(option == 1)
        {
            System.out.println("Recheck request sent from student ID: " + this.ID);
        }

        return option;

    }

    //student to exam controller
    public void recheck()
    {
        System.out.println("Recheck request sent from student ID: " + this.ID);
        examController.recheckStu(this.ID);
    }
    
}
