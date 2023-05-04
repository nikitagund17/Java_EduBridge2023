import java.util.*;
import java.util.Map.Entry;
class FirstExample{
    public static void main(String[] args) {
        HashMap<Integer,String> HM=new HashMap<>();

        HM.put(101,"java 1");
        HM.put(102,"java 2");
        HM.put(103,"java 3");
        HM.put(104,"java 4");
        HM.put(105,"java 5");

    
        Set<Entry<Integer,String>> S=HM.entrySet();

        Iterator I =S.iterator();
        while(I.hasNext()){
            Map.Entry<Integer,String> E1=(Map.Entry<Integer,String>)I.next();
            System.out.println("Key : "+E1.getKey());

            System.out.println("Value : "+E1.getValue());
        }

        

    }
}