import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>( );

        pq.add("nikita");
        pq.add("shan");
        pq.add("gauri");
        pq.add("");

        System.out.println(pq);

        System.out.println("head : "+pq.peek());




        pq.forEach((m)->{
            System.out.println(m);
        });

        pq.remove();

        System.out.println();
        pq.forEach((m)->{
            System.out.println(m);
        });


    }
}

/*import java.util.*;

class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> obj = new PriorityQueue<>();
        obj.add("Aman");
        obj.add("William");
        obj.add("Jack");
        obj.add("Mohan");
        obj.add("Harsh");
        obj.add("Kriti");
        // obj.add(null);

        System.out.println("Head: " + obj.peek());

        System.out.println("\nList is : \n");
        obj.forEach((m) -> {
            System.out.println(m);
        });

        obj.remove();
        obj.remove();

        System.out.println("\nList is : \n");
        obj.forEach((m) -> {
            System.out.println(m);
        });

    }

} */