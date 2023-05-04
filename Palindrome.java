import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to Check Palindrome or not: ");
        String str=sc.nextLine();

        String temp=str;
        String reverse="";
        int flag=0;
        for(int i=str.length()-1;i>=0;i--){
            for(int j=0;j<str.length();j++)
            if(str.charAt(i)!=str.charAt(j)){
                flag=0;
                break;
            }
            else{
                flag=1;
                
            }
            // reverse=reverse + temp.charAt(i);
        }

        // System.out.println(str);
        // System.out.println(reverse);
        
    
       if(flag==1){
        System.out.println(str + " is   palindrome ");
    }
    else{
        System.out.println(str + " is not palindrome "); 
    }
       
        
        // // System.out.println((str!=reverse?"Npt Palindrome":"Palindrome"));
        // if(str==reverse)
        // {
        //     System.out.println(str + " is  not palindrome ");
        // }
        // else{
        //     System.out.println(str + " is  palindrome "); 
        // }
      
    }
}
