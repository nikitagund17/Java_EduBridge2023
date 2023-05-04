class Employee {
    public int empid;
    public String name;
    public int age;

    Employee(int id,String nm,int a){
        empid=id;
        name=nm;
        age=a;


    }

    public String toString(){
        return empid+" "+name+"  "+age;
    }
}
