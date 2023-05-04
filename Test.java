@FunctionalInterface 
interface Inter11{
    void display();

}

public class Test {
    public static void main(String[] args) {
        Inter11 I=()->{System.out.println("Nameless Function");};

        I.display();
    }
}
