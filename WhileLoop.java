
//Q print table from m to n
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m :");
        int m = sc.nextInt();

        System.out.print("Enter n :");
        int n = sc.nextInt();

        while (m <= n) {
            int i = 1;
            while (i <= 10) {

                System.out.print(m * i + "  ");
                i++;
            }
            System.out.println();
            m++;
        }

    }
}
