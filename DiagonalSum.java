import java.util.*;
class DiagonalSum{
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        int LdiagSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    LdiagSum+=arr[i][j];
                }
            }
        }

        int RdiagSum=0;
    int m=arr.length-1;
    System.out.println();
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(m==j){
                RdiagSum+=arr[i][j];
            }
        }
        m--;
    }


        // for(int i=arr[0].length-1;i>=0;i--){
        //     for(int j=0;j<arr.length;j++){
        //         if(i==j){
        //             System.out.println(arr[i][j]);
        //             RdiagSum+=arr[i][j];
        //         }
        //     }
        // }

        System.out.println(" Left Diagonal sum : "+LdiagSum);

        System.out.println(" RIght Diagonal sum : "+RdiagSum);
    }

}