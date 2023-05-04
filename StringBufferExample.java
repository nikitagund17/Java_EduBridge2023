public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Java programing language");
        System.out.println(str.capacity());
        StringBuffer str1=new StringBuffer("Hello");
        System.out.println(str1.capacity());

        str1.append(str);

        System.out.println(str1.capacity());
        //(2*defaultcapacity)+2=(2*21)+2=44

        System.out.println(str1.length());

        System.out.println(str1.reverse());
        System.out.println(str1.insert(3, "1234"));
        System.out.println(str1);

        str1.delete(3, 9);
        System.out.println(str1);


    }
}
