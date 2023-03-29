import java.util.*;

public class CheckEquals {

//Also  find whether the  3 values are equal  or !


    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 values :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

      if(a==b&&b==c){
            System.out.println("3 values are equal");
        }
       else  if(a==b&&b!=c){
            System.out.println("a & b values are equal only");
        }

        else  if(a==c&&b!=c){
            System.out.println("a & c values are equal only");
        }

        else  if(a!=b&&b==c){
            System.out.println(" b & c values are equal only");
        }
        else{
            System.out.println(" 3 values are not equal");



    }
}

}