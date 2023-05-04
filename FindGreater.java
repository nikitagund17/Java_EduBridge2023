import java.util.*;

public class FindGreater {
    public static void main(String[] args) {
        // int arr[] = { 23, 12, 450, 67, 100 };

        // Arrays.sort(arr);
        // System.out.println("Max is "+ arr[arr.length-1]);

        Scanner sc =new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println();
        System.out.print("Enter Values :");
        for(int i=0;i<5;i++){

            arr[i]=sc.nextInt();
        }


        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minium No is:" + min);
        System.out.println("Maximum No is:" + max);
    }
}
