import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total Rows: ");
        int row=sc.nextInt();
        /*
            *
            **
            ***
            ****
            *****

         
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }  
        
        */

        // for(int i=1;i<=row;i++){

        //     for(int j=row;j>i;j--){
        //         System.out.print("   ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // } 

        for(int i=1;i<=row;i++){

            for(int j=row;j>=1;j--){

                if(j>i)
                System.out.print("   ");
                else 
                System.out.print(" * ");

            }

           
            System.out.println();
        } 


    }
}
