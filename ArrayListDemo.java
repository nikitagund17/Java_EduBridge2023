import java.util.*;

class ArrayListDemo{
    

        public static void main(String[] args) {
            Collection<String> S = new ArrayList<String>();
            List<String> L = new ArrayList<String>();
            ArrayList<String> AL = new ArrayList<String>();
    
            // List type
            L.add("best");
            L.add("Java");
            L.add("Programming");
            L.add("better");
    
            // add items in ArrayList type
            AL.add("hello");
            AL.add("happy");
            AL.add("better");
            AL.add("best");
    
            System.out.println(AL);
    
            // add item at 1 location
    
            AL.add(1, "Well");
    
            System.out.println(AL);
    
            AL.addAll(L);
    
            System.out.println(AL);
    
            // AL.clear();
    
            // System.out.println(AL);
    
            System.out.println(AL.contains("Java"));
    
            // AL.forEach( lambda expression/function );
    
            AL.forEach(
                    (m) -> {
                        System.out.println(m);
                    });
    
            System.out.println(AL.get(3));
    
            System.out.println(AL.indexOf("Java"));
    
            System.out.println(AL.lastIndexOf("better"));
    
            Iterator I = AL.iterator();
            while (I.hasNext()) {
                String s = (String) I.next();
                System.out.println(s);
            }
            
    
        }
    }