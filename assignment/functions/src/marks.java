import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter your marks 0 to 100 :  ");
        byte marks = input.nextByte() ;
        marksCalculator(marks);
    }
    static void marksCalculator(int marks){
        if(marks > 91 && marks <100){
            System.out.println("AA");
        }
        else if (marks > 81 && marks < 91){
            System.out.println("Ab");

        }else {
            System.out.println("fail");

        }
    }
}
