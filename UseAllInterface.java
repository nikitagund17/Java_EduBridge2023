
class Helper implements Inter2,Inter3{



    @Override
    public void func1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'func1'");
    }
    
    @Override
    public void func2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'func2'");
    }
    
 
    
    @Override
    public void func3() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'func3'");
    }
    
    @Override
    public void func4() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'func4'");
    }
}
    class UseAllInterface extends Helper{
        void fun1(){
            System.out.println("Func 1");
        }
        public static void main(String[] args) {
            UseAllInterface I=new UseAllInterface();
            I.fun1();
        }
    
    
}

