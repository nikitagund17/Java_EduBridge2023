import java.util.*;
public class MenuOptions {
    public static void main(String[] args) {
        System.out.printf("%50s\n\n","Main Menu");
        System.out.println("__________________________________________________________________");
        System.out.printf("| %-30s %-30s %-20s\n"," ","1: Add "," | ");
        System.out.printf("| %-30s %-30s %-20s\n"," ","2: Update "," | ");
        System.out.printf("| %-30s %-30s %-20s\n"," ","3: Delete "," | ");
        System.out.printf("| %-30s %-30s %-20s\n"," ","4: List "," | ");
        System.out.printf("| %-30s %-30s %-20s\n"," ","5: Search "," | ");
        System.out.printf("| %-30s %-30s %-20s\n"," ","6: Exit "," | ");
        System.out.println("__________________________________________________________________");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice :");

        int ch=sc.nextInt();

        switch ((ch)) {
            case 1:
            System.out.println("Add Operation");


            case 2:
            System.out.println("Delete Operation");

            case 3:
            System.out.println("Update Operation");

            case 4:
            System.out.println("Add Operation");

            case 5:
            System.out.println("Add Operation");

            case 6:
            exit(0);

                
                break;
        
            default:
                break;
        }
        


        


    }
}
