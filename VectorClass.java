import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector V = new Vector<>();
        V.add(new Employee(101, "nikita"));
        V.add(new Employee(102, "mayiri"));

        V.add(new Employee(103, "payal"));

        V.add(90);
        V.add(200);


        // System.out.println(V);
        V.forEach( (m)->{
            if(m instanceof Employee)
            System.out.println("m belongs employee");

            if(m instanceof String )
            System.out.println("m of String class");


        }); {
            
            
        }
    }
}
