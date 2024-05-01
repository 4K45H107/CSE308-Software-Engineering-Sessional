package mediator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        examController examController = new examController();
        for(int i = 1; i < 6; i++)
        {
            student student = new student(i);
            examController.addStudent(student);
        }

        teacher teacher = new teacher();
        teacher.setExamController(examController);
        examController.addTeacher(teacher);

        teacher.checkScript();


        Scanner scanner = new Scanner(System.in);
        int option;

        for(int i = 0; i < 3; i++)
        {
            int randomCheck = (int) (Math.random()*4 + 1);
            System.out.println(i + " " + randomCheck);
            for(student s: examController.studentList)
            {
                if(s.getID() == randomCheck)
                {
                    s.recheck();
                }
            }

        }


        while(true)
        {
            System.out.println("1. Re Examine");
            System.out.println("2. Re Examine Request from Student");
            option = scanner.nextInt();

            if(option == 1)
            {
                examController.reExamine();
            }

            if(option == 2)
            {
                examController.reExamineReq();
            }

            if(option == -1)
            {
                break;
            }
        }

        scanner.close();

    }
}