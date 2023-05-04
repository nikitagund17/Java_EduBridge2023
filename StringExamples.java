public class StringExamples {
   public static void main(String[] args) {
        String str1="java";
        String str2="Java";

        String str3=new String("java");
        String str4=new String("Java");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        if(str1.equals(str3)){
            System.out.println("str1 and str3 are equals");
        }
        else{
            System.out.println("not");
        }

        if(str2.equals(str4)){
            System.out.println("str2 and str4 are equals");
        }
        else{
            System.out.println("not");
        }

   } 
}
