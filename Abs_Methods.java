import java.rmi.StubNotFoundException;

abstract class A{
    public abstract void fun1();
        public abstract void fun2();


}

abstract class B extends A{
    public void fun1(){
        System.out.println("fun 1");
    }

    public void fun2(){
        System.out.println("fun 2");

    }
}

public class Abs_Methods {
     public void fun1(){
        System.out.println("fun 1");
    }
    public static void main(String[] args) {
        Abs_Methods ab=new Abs_Methods();
        ab.fun1();
    }
}