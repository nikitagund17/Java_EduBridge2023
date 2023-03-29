import java.util.*;

public class Activity {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");

        int a = sc.nextInt();

        System.out.print("Enter b : ");

        int b = sc.nextInt();
        // int num=10;
        // int Num=11;

        if(a>20||b>20){
            System.out.println("Addition is :"+(a+b));
            System.out.println("Subtraction is :"+(a-b));
            System.out.println("Multiplication is :"+(a*b));
            System.out.println("Division is :"+(a/b));
            
        }
        System.out.println("Operation Done !");





    }
}

