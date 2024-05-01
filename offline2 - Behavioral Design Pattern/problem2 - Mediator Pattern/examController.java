package mediator;

import java.util.ArrayList;
import java.util.Scanner;

public class examController {
    ArrayList <student> studentList = new ArrayList<>();
    teacher examinner;

    ArrayList <Integer> markList = new ArrayList<>();

    public static final Scanner scanner = new Scanner(System.in);

    int previusMarks;
    int updatedMarks;
    int recheckID;


    public void addStudent(student student)
    {
        student.setExamController(this);
        studentList.add(student);
    }

    public void addTeacher(teacher teacher)
    {
        examinner = teacher;
        examinner.setExamController(this);
    }

    //teacher to exam controller
    public void examine(ArrayList <Integer> marks)
    {
        this.markList = marks;
        setMarks();
        System.out.println("Scripts and marks of student ID 1,2,3,4,5 received by exam controller office");
        printMarks();
       
    }

    //controller to teacher
    public void reExamine()
    {
        int ID;

        System.out.println("Insert the ID to recheck");
        ID = scanner.nextInt();

        for(student s: studentList)
        {
            if(s.getID() == ID)
            {
                this.previusMarks = s.getMarks();
                System.out.println("Reexamin request of  student ID " + s.ID + " sent to examiner");
                this.updatedMarks = examinner.reExamine(s.ID,s.marks);
                s.setMarks(this.updatedMarks);

                if(this.previusMarks != this.updatedMarks)
                {
                    System.out.println("Student ID: "+ s.getID()+ " Previous marks: " + this.previusMarks + " Updated marks: " + this.updatedMarks);
                }

            }
        }
        printMarks();
        
    }

    //exam controller to student
    public void reExamineReq()
    {
        int ID;
        int option;

        for(student x: studentList)
        {
            System.out.println("Recheck");
            System.out.println("Student: " + x.getID());
            System.out.println("1. Yes");
            System.out.println("2. No");

            option = x.recheckReq();

            if(option == 1)
            {
                ID = x.getID();
                System.out.println("Student ID: " + ID + " has requested for reexamine the script");
                for(student s: studentList)
                {
                    if(s.getID() == ID)
                    {
                        this.previusMarks = s.getMarks();
                        this.updatedMarks = examinner.reExamine(ID, s.getMarks());
                        s.setMarks(this.updatedMarks);
                        this.recheckID = ID;
                    }
                }
        
                if(this.previusMarks != this.updatedMarks)
                {
                    System.out.println("Student ID: "+ this.recheckID + " Previous marks: " + this.previusMarks + " Updated marks: " + this.updatedMarks);
        
                }

            }

        }
        printMarks();

    }


    //exam controller
    public void printMarks()
    {
        for(student s: studentList)
        {
            s.printMarks();
        }
    }

    //exam controller to student
    public void setMarks()
    {
        int i = 1;
        for(int m: markList)
        {
            for(student s: studentList)
            {
                if(s.getID() == i)
                {
                    s.setMarks(m);
                }
            }
            i++;
        }
    }

    //student to exam controller to teacher
    public void recheckStu(int iD)
    {
        int ID = iD;
        System.out.println("Student ID: " + ID + " has requested for reexamine the script");
        for(student s: studentList)
        {
            if(s.getID() == ID)
            {
                this.previusMarks = s.getMarks();
                this.updatedMarks = examinner.reExamine(ID, s.getMarks());
                s.setMarks(this.updatedMarks);
                this.recheckID = ID;
            }
        }

        if(this.previusMarks != this.updatedMarks)
        {
            System.out.println("Student ID: "+ this.recheckID + " Previous marks: " + this.previusMarks + " Updated marks: " + this.updatedMarks);
        }
    }


}
