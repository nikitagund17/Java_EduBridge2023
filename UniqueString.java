// Q find out all unique strings and length of each string (use treeset class and split function)
// String ="hope happy best good better good well happy"
import java.util.*;
public class UniqueString {
    public static void main(String[] args) {

        String str="hope happy best good better good well happy";
        String arr[]=str.split(" ");

        TreeSet <String>T=new TreeSet<>();

        for(String  a:arr){
            T.add(a);
        }

        System.out.println(T);

        
    }
}
