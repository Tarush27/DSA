package Collection.comparator;

import java.util.Comparator;

public class AgeCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.age,o2.age);

    }
}
