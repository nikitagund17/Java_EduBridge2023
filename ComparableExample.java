/*  Comparable is the interface
compareTo()
java.lang
doing object comparision
*/

import java.util.ArrayList;
import java.util.Collections;

class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student_CompareTo> AL = new ArrayList<Student_CompareTo>();
        AL.add(new Student_CompareTo(101, "pooja", 12));
        AL.add(new Student_CompareTo(102, "william", 16));
        AL.add(new Student_CompareTo(103, "mohan", 10));
        AL.add(new Student_CompareTo(104, "suman", 15));

        Collections.sort(AL);

        for (Student_CompareTo s : AL) {
            System.out.println(s);
        }

    }
}
