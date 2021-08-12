package Collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Simple {
    public static void main(String ...args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(15,"mahas",101));
        list.add(new Student(20,"bjug",20));
        list.add(new Student(13,"nhufc",-30));
        System.out.println("sorting by name");
        list.sort(new NameCompare());
        for (Student st : list){
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }
        System.out.println("sorting by age");
        list.sort(new AgeCompare());
        for (Student s1 : list){
            System.out.println(s1.rollNo + " " + s1.name + " " + s1.age);
        }
    }
}
