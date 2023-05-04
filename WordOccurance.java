
import java.util.*;

public class WordOccurance {

    public static void main(String[] args) {
        String str = "Hello Java! . Java is programming language. Hello World ! Hello Java ";

        String res[] = str.split(" ");

        // shows the index id of first index of each word
        // for (String s : res) {

        //     System.out.println(s + " " + str.indexOf(s));
        // }

        //to find the count of each word
        int count=0;
        for(String s:res){
            for(int i=0;i<res.length;i++){
                if(s.equals(res[i])){
                    count++;
                    if(count>1){
                        res[i]="";
                    }
                }
            }

            //for integr us doublequalsto
            if(!s.equals(""))
            {
            System.out.println(s+" " +count);
            }
            count=0;
        }
       
    }

}
