@FunctionalInterface
interface Value{
    void display();


}


class FunctionalInterfaceEx implements Value{

    @Override
    public void display() {
            System.out.println("Display");
          }

    public static void main(String[] args) {
        FunctionalInterfaceEx ob=new FunctionalInterfaceEx();
        ob.display();
    }



}
