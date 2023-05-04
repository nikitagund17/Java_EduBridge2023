public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is a  programing language. It is platform independent. ";

        String arr[] = str.split(" ");
        StringBuffer sb ;

         str = "";

        for (String s : arr) {

            //way 1
            // sb = new StringBuffer(s);
            // sb.reverse();
            // str = str+ sb.toString() + " ";

        
        // way 2
        str=str+new StringBuffer(s).reverse().toString()+" ";
        }
        System.out.println(str);

    }
}
