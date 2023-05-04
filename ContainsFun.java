public class ContainsFun {
    public static void main(String[] args) {
        String str="Hello Java! . Java is programming language. Hello World ! Hello Java ";


        System.out.println(str.contains("hello")?"true":"false");

        System.out.println(str.lastIndexOf("Hello")-1);
        System.out.println(str.indexOf("Hello"));

        


    }

}
