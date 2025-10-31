package JUnit;

import java.util.Random;

public class Student {
    String name;
    String university;
    String specialization;
    int age;
    int subjects;
    int[] grades;
    int id;
    double bonus;
    int absents;
    int gradeCount = 0;

    public Student(String name, String university, String specialization,
                   int age, double bonus, int absents, int subjects) {
        this.name = name;
        this.university = university;
        this.specialization = specialization;
        this.age = age;
        this.subjects = subjects;
        this.grades = new int[subjects];
        this.bonus = bonus;
        this.absents = absents;
    }

    public int registrastionYear() {
        Random rand = new Random();
        int minYear = 1900;
        int maxYear = 2025;

        int randomYear = rand.nextInt(maxYear - minYear) + minYear;

        return randomYear;
    }

    public double calculateGrade() {
        if (gradeCount == 0) {
            System.out.println("Studentul nu are note introduse.");
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }

        double average = sum / gradeCount;
        System.out.println("Media generala a notelor este: " + average);
        return average;
    }


    public double calculateBonus() {
        double sum = this.calculateGrade();
        sum = sum + bonus;
        System.out.println("Media generala a notelor cu bonus este: " + sum);

        return sum;
    }

    public void changeUniversity(String university) {
        this.university = university;
    }

    public int generateId() {
        Random rand = new Random();
        id = rand.nextInt(100);
        return id;
    }

    public String compareGrades(Student s1, Student s2) {
        double gr1 = s1.calculateGrade();
        double gr2 = s2.calculateGrade();
        String string1, string2, string3;

        if (gr1 > gr2) {
            string1 = ("Studentul " + s1.name + " are note mai mari");
            return string1;
        } else if (gr1 == gr2) {
            string2 = ("Studentul " + s1.name +
                    " are aceeasi medie cu studentul " + s2.name);
            return string2;
        } else {
            string3 = ("Studentul " + s2.name + " are note mai mari");
            return string3;
        }

    }

    public String checkAge() {
        String string;
        if (this.age < 18)
            string = "Prea mic pentru facultate";
        else if (18 <= this.age && this.age <= 25)
            string = ("Prima facultate");
        else
            string = ("A doua facultate");
        return string;
    }

    public String toString() {
        return "Studentul " + name + " este la universitatea " + university
                + " la specializarea " + specialization;
    }

    public String checkAbsents() {
        String s1, s2;
        if (this.absents > 10) {
            s1 = ("Studentul trebuie exmatriculat");
            return s1;
        }
        s2 = "Studentul are putine absente";
        return s2;
    }

    public void addGrade(int grade) {
        if (gradeCount < subjects) {
            grades[gradeCount] = grade;
            gradeCount++;
        } else
            System.out.println("Catalogul este plin");
    }

}
