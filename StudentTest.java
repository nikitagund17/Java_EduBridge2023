// generic class
class Student {
    int stid;
    String name;

    Student(int id, String nm) {
        stid = id;
        name = nm;
    }

    public String toString() {
        return "Record : " + stid + " - " + name;
    }

}

class Test<T> {
    T obj;

    T getValue() {
        return obj;
    }

    void setValue(T ob) {
        this.obj = ob;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Test<Float> T1 = new Test<Float>();
        T1.setValue(90.90F);
        System.out.println(T1.getValue());

        Test<String> T2 = new Test<String>();
        T2.setValue(new String("Hello"));
        System.out.println(T2.getValue());

        Test<Student> T3 = new Test<Student>();
        T3.setValue(new Student(101, "pooja"));
        System.out.println(T3.getValue());

    }
}