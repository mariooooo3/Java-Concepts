package Collections;

import java.util.Random;
import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Claudiu", "Stefanescu", 3231, 9));
        students.add(new Student("Andrei", "Grozav", 5412, 8));
        students.add(new Student("Tudor", "Tudose", 8754, 7));
        students.add(new Student("Stefan", "Stefanescu", 1738, 9));

        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
        ArrayList<Student> copyStudents = new ArrayList<>();
        copyStudents = students;

        PriorityQueue<Student> queue = new PriorityQueue<>(Comparator.comparingLong(Student::getId));

        Collections.addAll(queue, copyStudents.toArray(new Student[copyStudents.size()]));

        System.out.println("\nOrdonati crescator dupa Id:\n");
        for (Student s : queue) {
            System.out.println(s);
        }

        Map<Student, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Computer Science");
        subjects.add("Geography");
        subjects.add("History");
        subjects.add("Lecture");

        Random rand = new Random();
        for (Student s : students) {
            ArrayList<String> chosenSubjects = new ArrayList<>();

            while (chosenSubjects.size() < 2) {
                String subject = subjects.get(rand.nextInt(subjects.size()));
                if (!chosenSubjects.contains(subject)) {
                    chosenSubjects.add(subject);
                }
            }
            map.put(s, chosenSubjects);
        }
        System.out.println("\n Materii aleatorii pentru fiecare student ");
        for (Map.Entry<Student, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
