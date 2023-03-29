class DataTypes {
    public static void main(String[] args) {

        /*
        // Float - wrapper class
        // float -data type

        float val;
        val = 9.9f;
        System.out.println((val + val) / val);

        double s;
        s = 9.9;
        System.out.println((s + s) / s);

        char ch='h';

        // implicit type casting
        System.out.println(ch+(ch));

        //explisit type casting
        System.out.println((int)ch+(ch));

        boolean g=false;
        System.out.println(g);


        int a=90;
        // System.out.println("A : "+(a++)); //90
        // System.out.println(a);//91

        // System.out.println("A : "+(++a)); //92
        // System.out.println(a);//92

        // System.out.println(++a++); //unexpected type error (cant use pre and post simutaniously)

        int b=a++;
        System.out.println(a);
        System.out.println(b++);
        System.out.println(+a);

        */


        int a,b,c;
        b=1;
        c=2;
        a=3;

        // System.out.println(a+ b++ + ++c);
       int  d=a+ b++ + ++c;
       System.out.println(d);
       System.out.println("b"+b);
       System.out.println("d"+d);
       System.out.println("a"+a);
        d+= ++a * b++;
        //7+(4*2)=15
        

        System.out.println(d);//15





    }
}