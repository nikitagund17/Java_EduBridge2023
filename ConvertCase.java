public class ConvertCase {
    public static void main(String[] args) {
        String s=new String("programming");
        char ch[]=new char[s.length()];
        int temp;

        //convert string int char array
        ch=s.toCharArray();

        //change ascii value of index with upper case ascii value
        for(int i=0;i<ch.length;i++){
            
            temp =((int)ch[i])-32; // change ascii value from lower to upper 
            ch[i]=(char)temp;//typecasting
            // System.out.println(ch[i]);
        }

        //convert char aray into string format
        String upperLetters=new String(ch);
        System.out.println(upperLetters);
    }
}
