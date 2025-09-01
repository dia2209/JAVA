/*Question 7:
Create a class Student with private variables name and marks.
Write getter and setter methods to access and modify them.*/
public class Student3{
    private String name;
    private int marks;

    public void setName(String name){
        this.name=name;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }
    
    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }
}



