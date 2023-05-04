public class StringToByte {
    public static void main(String[] args) {
        String str="This is test program";

        int len=str.length();

        //conversion pf cgar into bytes
        byte[] bt= str.getBytes();


        //enhanced for loop
        // for(variable:collection/array)
        for(byte i:bt){
            System.out.print(i+" ");
        }
        System.out.println();
       String result[] =str.split(" ");
       for(String re:result){
        System.out.print(re+" ");
       }
    }
}
