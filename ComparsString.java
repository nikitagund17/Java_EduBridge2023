public class ComparsString {
    public static void main(String[] args) {
        String s="nikita";

        String s1="NIKITA";


        //case sensitive
        // int result=(s.compareTo(s1));

        //it is case insensitive
        int result=(s.compareToIgnoreCase(s1));
        if(result==0){
            System.out.println("Same");
        }
        else if(result>0)
       {
            System.out.println("String 1 is greater");
        }

        else 
       {
            System.out.println("String 2 is greater"); 
                                            
        }
    }
}
