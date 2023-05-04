// @FunctionalInterface
// interface Inter10 {
//     void display();
// }

// public class LambdaExpressions {

//     public static void main(String[] args) {
//         Inter10 I = () -> 
//         {
//             System.out.println("Lambda Exp");
//         };

//         I.display();
//     }

// }


@FunctionalInterface
interface Inter10 {
    int add(int a,int b);
}

public class LambdaExpressions {

    public static void main(String[] args) {
        Inter10 I = (a,b) -> 
        {
            return a+b;
        };

        System.out.println(I.add(4,5));
        
    }

}
