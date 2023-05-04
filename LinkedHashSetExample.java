// import java.util.*;

// public class LinkedHashSetExample {
//     public static void main(String[] args) {
//         HashSet<Integer> H1 = new HashSet<>();
//         H1.add(20);
//         H1.add(30);

//         HashSet<Integer> H2 = new HashSet<>();
//         H2.add(22);
//         H2.add(33);

//         HashSet<Integer> H3 = new HashSet<>();
//         H3.add(25);
//         H3.add(35);

//         HashSet<Integer> H4 = new HashSet<>();
//         H4.add(28);
//         H4.add(38);

//         HashSet<Integer> H5 = new HashSet<>();
//         H5.add(27);
//         H5.add(37);

//         LinkedHashSet<HashSet<Integer>> LH = new LinkedHashSet<>();

//         LH.add(H1);
//         LH.add(H2);
//         LH.add(H3);
//         LH.add(H4);
//         LH.add(H5);

//         LH.forEach((m) -> {
//             System.out.println(m);
//         });

//     }
// }


import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> H1 = new HashSet<Integer>();
        H1.add(89);
        H1.add(67);

        HashSet<Integer> H2 = new HashSet<Integer>();
        H1.add(45);
        H1.add(72);

        HashSet<Integer> H3 = new HashSet<Integer>();
        H1.add(39);
        H1.add(10);

        HashSet<Integer> H4 = new HashSet<Integer>();
        H1.add(41);
        H1.add(83);

        LinkedHashSet<HashSet<Integer>> L1 = new LinkedHashSet<HashSet<Integer>>();
        L1.add(H1);
        L1.add(H2);
        L1.add(H3);
        L1.add(H4);

        L1.forEach((m) -> {
            System.out.println(m + " " + m.getClass().getName());
        });

    }
}
