package JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    Student s1 = new Student("Claudiu", "Asachi",
            "Automatica", 20, 1, 3, 4);
    Student s2 = new Student("Mario", "Asachi",
            "Informatica", 22, 0.5, 7, 6);
    Student s3 = new Student("Teut", "Medicina",
            "Generala", 27, 0.3, 13, 5);

    @Test
    public void compareGrades() {
        s1.addGrade(5);
        s1.addGrade(6);
        s1.addGrade(7);

        s2.addGrade(5);
        s2.addGrade(10);
        s2.addGrade(5);

        String string1 = s1.compareGrades(s1, s2);
        assertEquals(string1, "Studentul " + s2.name + " are note mai mari");

        s3.addGrade(7);
        s3.addGrade(7);
        s3.addGrade(4);
        s3.addGrade(10);

        String string2 = s2.compareGrades(s2, s3);
        assertEquals(string2, "Studentul " + s3.name + " are note mai mari");
    }

    @Test
    public void registrationYear()
    {
        int y1 = s1.registrastionYear();
        assertTrue(y1>= 1900 && y1<= 2025);

        int y2 = s2.registrastionYear();
        assertTrue(y2>= 1900 && y2<= 2025);

        int y3 = s3.registrastionYear();
        assertTrue(y3>= 1900 && y3<= 2025);
    }


    @Test
    public void generateId() {
        int id1 = s1.generateId();
        assertTrue(id1 >= 0 && id1 < 100);

        int id2 = s1.generateId();
        assertTrue(id2 >= 0 && id2 < 100);

        int id3 = s1.generateId();
        assertTrue(id3 >= 0 && id3 < 100);

    }

    @Test
    public void addGrades() {
        s1.addGrade(10);
        s1.addGrade(5);
        s1.addGrade(9);

        assertEquals(3, s1.gradeCount);

        s2.addGrade(9);

        assertEquals(1, s2.gradeCount);

        s3.addGrade(7);
        s3.addGrade(6);

        assertEquals(2, s3.gradeCount);
    }

    @Test
    public void calculateGrade() {
        s1.addGrade(10);
        s1.addGrade(5);
        s1.addGrade(9);
        double c1 = s1.calculateGrade();

        assertEquals(8.0, c1);

        s2.addGrade(9);
        double c2 = s2.calculateGrade();

        assertEquals(9.0, c2);

        s3.addGrade(7);
        s3.addGrade(6);
        double c3 = s3.calculateGrade();

        assertEquals(6.5, c3);

    }

    @Test
    public void changeUniversity() {
        s1.changeUniversity("Medicina");
        assertEquals(s1.university, "Medicina");

        s2.changeUniversity("Cuza");
        assertEquals(s2.university, "Cuza");

        s3.changeUniversity("Asachi");
        assertEquals(s3.university, "Asachi");
    }

    @Test
    public void calculateBonus() {
        s1.addGrade(10);
        s1.addGrade(5);
        s1.addGrade(9);

        double b1 = s1.calculateBonus();
        assertEquals(9.0, b1);

        s2.addGrade(9);
        double b2 = s2.calculateBonus();
        assertEquals(9.5, b2);

        s3.addGrade(7);
        s3.addGrade(6);
        double b3 = s3.calculateBonus();
        assertEquals(6.8, b3);
    }

    @Test
    public void checkAge() {
        String string1 = s1.checkAge();
        assertEquals(string1, "Prima facultate");

        String string2 = s2.checkAge();
        assertEquals(string2, "Prima facultate");

        String string3 = s3.checkAge();
        assertEquals(string3, "A doua facultate");

    }

    @Test
    public void testToString() {
        String string1 = s1.toString();
        assertEquals(string1, "Studentul Claudiu este la universitatea Asachi la specializarea Automatica");

        String string2 = s2.toString();
        assertEquals(string2, "Studentul Mario este la universitatea Asachi la specializarea Informatica");

        String string3 = s3.toString();
        assertEquals(string3, "Studentul Teut este la universitatea Medicina la specializarea Generala");
    }

    @Test
    public void checkAbesnts() {
        String string1 = s1.checkAbsents();
        assertEquals(string1, "Studentul are putine absente");

        String string2 = s2.checkAbsents();
        assertEquals(string2, "Studentul are putine absente");

        String string3 = s3.checkAbsents();
        assertEquals(string3, "Studentul trebuie exmatriculat");
    }

}

