public class GetChars {
    public static void main(String[] args) {
        String s=new String("Programming");

        //character array
        char dist[]=new char[20];
        s.getChars(3, 7,dist, 0);
        
        //conversion
        //char earray get converted in string
        String str1=new String(dist);
        System.out.println(str1);



        char result[]=s.toCharArray();
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
            
        }

        


    }
}
