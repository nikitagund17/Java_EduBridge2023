// Q find all unique elelments

import java.util.*;
public class TreeSetUniqueEle {
    // public static void main(String[] args) {

        // int arr[]={2,3,4,2,3,4,5,6,7,3,4,2,3,4,5,6,7};

        // TreeSet<Integer> T=new TreeSet<>();
        
        // for(int a: arr){T.add(a);}

        // T.forEach((m)->{
        //     System.out.print(m+"  ");
        // });
        // System.out.println();
        // System.out.println("largest "+arr[arr.length-1]);



        Set<Integer> values (int arr[])
        {
            TreeSet<Integer> T=new TreeSet<>();
            for(int a:arr){
                T.add(a);
            }

            int small =T.first();
            int largest=T.last();

        TreeSet<Integer> M=new TreeSet<>();
        M.add(small);
        M.add(largest);

        return M;

        }
        
        public static void main(String[] args) {
        int arr[]={2,3,4,2,3,4,5,6,7,3,4,2,3,4,5,6,7};

        TreeSetUniqueEle obj=new TreeSetUniqueEle();
        

        System.out.println(obj.values(arr));

        }
    }


    /*
     * import java.util.*;

public class Unique {
    Set<Integer> values(int ar[]) {

        TreeSet<Integer> T = new TreeSet<Integer>();
        for (int a : ar) {
            T.add(a);
        }

        int small = T.first();
        int large = T.last();

        TreeSet<Integer> M = new TreeSet<Integer>();
        M.add(small);
        M.add(large);

        return M;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 4, 5, 6, 5, 6, 7, 6, 7, 8, 9, 8, 7, 6, 7, 8, 9 };

        Unique obj = new Unique();
        System.out.println(obj.values(arr));

    }

}
     */