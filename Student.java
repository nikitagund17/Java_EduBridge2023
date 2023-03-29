public class Student {
    int stid;
    static int score;

    static{
        score=89;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        System.out.println(s1.score);

        System.out.println(Student.score);//proper way

        Student.score=Student.score*100;
        System.out.println(Student.score);
        System.out.println(s2.score);

        int a=18;
        
        //a<<<=4;// not working on windows but is valid
        a<<=2;
        System.out.println(a);//72

        int b=18;
        System.out.println(b>>2);//4
        



    }
}
