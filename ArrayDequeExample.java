import java.util.*;
public class ArrayDequeExample {
    // Array implementation of queue and dequeue in array

    public static void main(String[] args) {
        ArrayDeque<String>A=new ArrayDeque<>();

       A.add("A");
       A.addFirst("B");
       A.addLast("c");

       System.out.println(A);

       A.offer("DD");
       A.offerFirst("AA");

       System.out.println(A);

       System.out.println(A.getFirst());
       System.out.println(A.getLast());

       A.remove();
       A.removeFirst();
       System.out.println(A);

    }
}

/*mport java.util.*;

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
