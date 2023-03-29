// Using StringRepete function
import java.util.*;
public class StringPattern {
    public static void main(String[] args) {
        
    
    String s=" * ";

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Total Rows : ");
   
    int row=sc.nextInt();
    /*
        *
        **
        ***
        ****
        *****

     */
    for(int i=1;i<=row;i++){
        
            System.out.println(s.repeat(i));
     
    } 

//     for(int i=row;i>=0;i--){
        
//         System.out.println(s.repeat(i));
 
// } 
}
}
