
/*@FunctionalInterface
interface Inter6{
    void display();
}





public class ObjectBasedMethodRef {
    public void ShowData(){
        System.out.println("ShowData");
    }
    
    public static void main(String[] args) {
        ObjectBasedMethodRef obj=new ObjectBasedMethodRef();
       
        Inter6 I= obj :: ShowData; 
        I.display();
    }


}*/


/* 
@FunctionalInterface
interface Inter7 {
    int add(int a, int b);
}

public class ObjectBasedMethodRef {
    public int ShowData(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        ObjectBasedMethodRef obj = new ObjectBasedMethodRef();

        Inter7 I = obj::ShowData;
        int result= I.add(3, 6);
        System.out.println(result);
       
    }

}
*/

