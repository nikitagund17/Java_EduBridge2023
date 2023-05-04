import java.util.Vector;

public class VectorExampleGeneric {

    public static void main(String[] args) {
        Vector V = new Vector<>();
        V.add(new Employee(101, "nikita"));
        V.add(new Employee(102, "mayiri"));

        V.add(new Employee(103, "payal"));

       


        // System.out.println(V);
        V.forEach( (m)->{
            if(m instanceof Employee)
           System.out.println(m);


        }); {
            
            
        }
    }
}


