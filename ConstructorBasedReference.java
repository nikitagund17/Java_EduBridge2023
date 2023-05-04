@FunctionalInterface
interface Inter9{
    void display();

}


public class ConstructorBasedReference {

    ConstructorBasedReference(){
        System.out.println("ConstructorBasedReference");
    }
    
    public static void main(String[] args) {
        Inter9 I=ConstructorBasedReference::new;
        I.display();
            
        
    }
}
