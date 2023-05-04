class Test<T> {
    T obj;

    T getValue(){
        return obj;
        
    }

    void setValue(T ob) {
        this.obj = ob;

    }
}

class GenericClass {
    public static void main(String[] args) {
        Test<Integer> t=new Test<Integer>();
        t.setValue(49);
        System.out.println( t.getValue());

        Test<String> t2=new Test<String>();
        t2.setValue("nikita");
        System.out.println( t2.getValue());
       
    }
}


