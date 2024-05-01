package mediator;

import java.util.ArrayList;

public class teacher {
    ArrayList <Integer> markList = new ArrayList<>();

    int reCheckMark;

    examController examController;
    
    public examController getExamController() {
        return examController;
    }

    public void setExamController(examController examController) {
        this.examController = examController;
    }

    //teacher to exam controller
    public  void checkScript()
    {
        for(int i = 0; i < 5; i++)
        {
            int mark = (int) (Math.random()*100);
            markList.add(mark);

        }
        System.out.println("Scripts and marks of student ID 1,2,3,4,5 sent to exam controller office");
        examController.examine(markList);       
    }

    //exam controller to teacher
    public int reExamine(int id, int mark)
    {
        System.out.println("Reexamin request of  student ID " + id + " received by examiner");

        if(mark > 100)
        {
            this.reCheckMark = 100;
            return this.reCheckMark;
        }

        this.reCheckMark = mark + (int) (Math.random()*10);

        if(this.reCheckMark > 100)
        {
            this.reCheckMark = 100;
        }

        return this.reCheckMark;
    }


}
