package oops.static_keyword;

public class Student {
    int rollNo;
    String name;
    static String college = "CU";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void show(){
        System.out.println(rollNo + " " + name + " " + college);
    }
    public static void main(String[] args){
        Student st = new Student(1,"krhf");
        Student st1 = new Student(2,"uyewir");
        Student.college = "BITS";// static variable called through class only
        st.show();
        st1.show();
    }
}
