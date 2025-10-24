package Encapsulation;

public class Internship {
    private String name;
    private double minGrade;
    private Student[] students;

    public Internship(String name, double minGrade, Student[] students) {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }

    public void setNume(String name) {
        this.name = name;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void chooseCandidatesForInterview() {
        for (int i = 1; i < students.length; i++)
            if (students[i].getGrade() >= minGrade)
                System.out.println("Candidate " + students[i].getName() + " got a phone interview at: " + name);
    }

}

