/*
 Q3 java program to reads a number and display the square ,cube abs forth power 
 Expected output:
 Square: .2f
 Cube : .2f
 Fourth power : 50625.00
 */

import java.util.Scanner;
public class SquareCubePow {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Number -> ");
        float number = sc.nextFloat();

        System.out.printf("Square :%.2f", (number*number));
        System.out.println();

        System.out.printf("Cube: %.2f",(number*number*number));
        System.out.println();
        System.out.printf("Forth Power: %.2f",(Math.pow(number, 4)));

    }
}

/*
 output
Enter Number -> 4
Square :16.00
Cube: 64.00
Forth Power: 256.00
 */
