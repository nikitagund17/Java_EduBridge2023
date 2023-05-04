import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Age implements Comparator {
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        if (e1.age == e2.age)
            return 0;

        else if (e1.age > e2.age)
            return 1;

       else
            return -1;

    }
}

class Name implements Comparator {
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        if (e1.name.equals( e2.age))
            return 0;

        else if (e1.name.compareTo(e2.name)>0)
            return 1;
        else
            return -1;

    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Employee>AL=new ArrayList<>();
        AL.add(new Employee(101, "nikiat", 21));
        AL.add(new Employee(102, "Aman", 21));

        AL.add(new Employee(103, "nik", 22));

        AL.add(new Employee(104, "nikii", 11));

        AL.add(new Employee(105, "nikee", 14));

        AL.add(new Employee(106, "niks", 29));


// sort in basis of age
        // Collections.sort(AL, new Age());

        Collections.sort(AL, new Name()); // on basis of name



        AL.forEach((m)->{System.out.println(m);});

    }

}
