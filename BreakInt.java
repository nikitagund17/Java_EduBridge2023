/*Write a Java program to break an integer into a sequence of individual digits.

An integer is a number that can be written without a fractional component. For example, 12, 8, 0, and -2365 are integers, while 4.25, 57 1 / 2, and √3 are not

Test Data
Input six non-negative digits: 123456


 */
import java.util.*;
public class BreakInt{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = sc.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
      System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    }
}
