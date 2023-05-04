public class LargestWord {
    public static void main(String[] args) {
        String str="Java is a  programing language. It is platform independent. ";
        int MaxLen=0;
        String maxString="";
        String result[] =str.split(" ");

        for(String re:result){
            
         System.out.print(re+" ");
         if(re.length()>MaxLen){
            MaxLen=re.length();
            maxString=re;

         }
          

        }
        System.out.println();
        System.out.println("largest String  is : " + maxString +"of length : "+MaxLen);
    }
}
