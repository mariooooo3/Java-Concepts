package Collections;

public class Student implements Comparable<Student> {
    public String name;
    public String surname;
    public long id;
    public double average;

    public Student(String name, String surname, long id, double average) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.average = average;
    }

    public String toString() {
        return name + " " + surname + " " + id + " " + average;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public int compareTo(Student o) {
        if (this.average == o.average) {
            if (this.surname.equals(o.surname)) {
                return this.name.compareTo(o.name);
            } else
                return this.surname.compareTo(o.surname);
        } else
            return Double.compare(this.average, o.average);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        Student student = (Student) obj;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
