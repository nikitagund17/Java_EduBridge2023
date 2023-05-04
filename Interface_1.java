interface Inter1 {
    public static final float pie = 3.14f;

    void display();

    void setData();

}

class Interface_1 implements Inter1 {

    public void display() {
       System.out.println("Display"); 
    }

    public void setData() {
    System.out.println("SetData");
    }

    public static void main(String[] args) {
        Interface_1 It=new Interface_1();
        It.display();
        It.setData();
    }

}