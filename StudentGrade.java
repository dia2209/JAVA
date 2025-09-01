//StudentGrade && Name: Diya Manandhar
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects:");
        for(int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            if(marks[i] < 35) {
                System.out.println("Failed in subject " + (i+1));
                return;
            }
            total += marks[i];
        }

        float percentage = total / 5.0f;
        char grade;

        switch ((int)percentage / 10) {
            case 10: case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            case 5: grade = 'E'; break;
            default: grade = 'F';
        }

        System.out.println("Percentage = " + percentage + "%");
        if (grade == 'F')
            System.out.println("Failed");
        else
            System.out.println("Grade = " + grade);
    }}
