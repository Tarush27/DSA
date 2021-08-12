package Collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
    public static void main(String ...args){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(-1,"tarush",20));
        studentArrayList.add(new Student(-2,"mudita",10));
        studentArrayList.add(new Student(3,"atul",-35));
        Collections.sort(studentArrayList);
        for (Student st : studentArrayList){
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }
    }
}
