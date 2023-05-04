import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Employee> t=new TreeSet<>();
       t.add(new Employee(101, "nikita"));

       t.add(new Employee(102, "diksha"));

       t.add(new Employee(103, "savi"));

       t.add(new Employee(104, "sakshi"));

       t.add(new Employee(105, "anju"));

       t.add(new Employee(106, "gauri"));

       //here to print this we nead comparable interface

    //    for (Employee emp : t) {
    //     System.out.println(emp);

        
    // }

    System.out.println(t.comparator());


    TreeSet<Integer> T=new TreeSet<>();
    T.add(350);
    T.add(250);
    T.add(400);
    T.add(450);
    T.add(150);
    T.add(260);
    T.add(410);
    T.add(460);
//   System.out.println(T); // printed in Inorder Bst

  TreeSet<String> TS=new TreeSet<>();
  TS.add("nikita");
  TS.add("gauri");
  TS.add("savita");
  TS.add("Diksha");
  TS.add("sakshi");
  TS.add("anju");
  TS.add("me");
  TS.add("tanu");
// System.out.println(TS); // printed in Inorder Bst
// [150, 250, 260, 350, 400, 410, 450, 460]
//[Diksha, anju, gauri, me, nikita, sakshi, savita, tanu]




    }

}
