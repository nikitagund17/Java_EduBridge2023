public class StringClass {
    public static void main(String[] args) {

        String s="Hello"; //reference type
        String s1=new String ("Hello"); //object creation

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        if(s==s1){
            
        }

        else{
            System.out.println("s != s1");
              //  output s!=s1 
        }

        if(s.equals(s1)){
            System.out.println("s == s1");
        }

        
      
    }
}
