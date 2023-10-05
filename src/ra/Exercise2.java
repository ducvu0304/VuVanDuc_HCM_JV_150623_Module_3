package ra;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Nam", 90));
        list.add(new Student(2,"Hoa", 80));
        list.add(new Student(3,"Mây", 70));

        Collections.sort(list, Comparator.comparingDouble(Student::getScore));

        list.forEach(s -> System.out.println(s.getName()));
    }
}
