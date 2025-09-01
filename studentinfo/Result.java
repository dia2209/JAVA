package studentinfo;
public class Result{
    Student5 student;
    Marks marks;

    public Result(Student5 student, Marks marks){
        this.student=student;
        this.marks=marks;
    }

    public void display(){
        System.out.println("Name: "+student.name);
        System.out.println("Roll: "+student.roll);
        System.out.println("Total: "+marks.total());
        System.out.println("Average: "+marks.average());

        if(marks.average()>=50){
            System.out.println("Grade: Pass");
        }
        else{
            System.out.println("Grade: Fail");
        }
    }
}