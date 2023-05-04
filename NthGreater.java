import java.util.*;
public class NthGreater {
    public static void main(String[] args) {
        int arr[]={34,54,2,67,9};

        int copiedArr[]=arr.clone();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Nth value : ");

        int num=sc.nextInt();

        int max=0,loc=0;
        for(int i=1;i<=num;i++){
            max=0;
            for(int m=0;m<copiedArr.length;m++){
                if(copiedArr[m]>max){
                    max=copiedArr[m];
                    loc=m;
                    
                }
                
        }
copiedArr[loc]=0;



    }
    

    System.out.println(num+" th max is :"+arr[loc]);
}
}
