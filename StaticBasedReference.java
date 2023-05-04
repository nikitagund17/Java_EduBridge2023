// static function
@FunctionalInterface
interface Inter8 {
    void Display();
}

public class StaticBasedReference {
    public static void ShowData() {
        System.out.println("ShowDta");
    }

    public static void main(String[] args) {
        Inter8 I= StaticBasedReference::ShowData;

       I.Display();
       
    }

}

