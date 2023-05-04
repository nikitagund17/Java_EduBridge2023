class Student_CompareTo implements Comparable {
    int stid;
    int age;
    String name;


    Student_CompareTo(int id,String nm,int a){
        stid=id;
        age=a;
        name=nm;
    }

    

    public String toString(){
        return stid+"  "+name+"  "+age;
    }



    @Override
    public int compareTo(Object o) {

        Student_CompareTo S=(Student_CompareTo)o;

        if(age==S.age)
            return 0;
        

        else if(age>S.age)
        return 1;

        else
        return -1;

    }
}
