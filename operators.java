//Q1 enter 3 numbers and find out greater
//Also  find whether the  3 values are equal  or !
import java.util.*;
public class operators {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 values :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println(a+ " is greater ");

        }

        else if(b>a&& b>c){
            System.out.println(b+" is greater");
        }
        else if(a==b&&b==c){
            System.out.println("3 values are equal");
        }
        else{
            System.out.println(c+" is greater");
        }

        

       





    }
}
