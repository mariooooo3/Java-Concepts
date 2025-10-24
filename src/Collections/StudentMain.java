package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Claudiu", "Stefanescu", 3231, 9));
        students.add(new Student("Andrei", "Grozav", 5412, 8));
        students.add(new Student("Tudor", "Tudose", 8754, 7));
        students.add(new Student("Stefan", "Stefanescu", 1738, 9));

        Collections.sort(students);
        for(Student s : students)
        {
            System.out.println(s);
        }


    }
}
