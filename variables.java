class variables{

    // int age;
    static int x;
    static int z;

    static{
        x=90;
        z=100;
    }

    void exp(){
        x++;
    }
    public static void main(String[] args) {
        // variables obj=new variables();
        // System.out.println(obj.age);


        // byte b;

        // int i ;

        // i=500089070;

        // b=(byte)i;

        // System.out.println(b);

    variables obj=new variables();
    obj.exp();
    variables obj2=new variables();
    obj2.exp();
    variables obj3=new variables();


    
    obj3.exp();
    variables obj4=new variables();
    obj4.exp();

    System.out.println(x);

    // obj.x=obj.x*obj2.x;

    // variables.z=variables.z*variables.z;

    // System.out.println(obj.x);
    // System.out.println(variables.z);

    

    



       
    }

}

