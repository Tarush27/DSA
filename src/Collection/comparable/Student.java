package Collection.comparable;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(rollNo, o.rollNo);
    }
}

