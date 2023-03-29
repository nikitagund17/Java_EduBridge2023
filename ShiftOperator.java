public class ShiftOperator {
    public static void main(String[] args) {
        int a=18;
        
        //a<<<=4;// not working on windows but is valid
        a<<=2;
        System.out.println(a);//72

        int b=18;
        System.out.println(b>>2);//4


        
    }
}
