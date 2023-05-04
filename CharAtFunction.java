public class CharAtFunction {
    public static void main(String[] args) {
        String str="Programming";

        System.out.println(str.charAt(7));

        String result="";

        for(int i=str.length()-1;i>=0;i--){

            
            result=result+str.charAt(i);
            // System.out.print(str.charAt(i));


        }

        System.out.println(result);
    }
}
