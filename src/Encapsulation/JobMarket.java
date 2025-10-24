package Encapsulation;

public class JobMarket {
    public static void main(String[] args) {
        Student darius = new Student();
        darius.setName("Darius");
        darius.setGrade(9.15);
        Student gigel = new Student("Gigel", 7.80);
        Student dorel = new Student("Dorel", 10);
        Student marcel = new Student("Marcel", 7.20);
        Student ionel = new Student("Ionel", 9.10);

        Student[] std = {gigel, dorel, marcel, ionel, darius};

        Internship google = new Internship("Google", 8.70, std);
        Internship microsoft = new Internship("Microsoft", 9.90, std);
        Internship facebook = new Internship("Facebook", 7, std);
        Internship amazon = new Internship("Amazon", 9.20, std);

        dorel.setName("Mauf");
        gigel.setGrade(10);
        //dorel.grade = 5;


        facebook.chooseCandidatesForInterview();
        google.chooseCandidatesForInterview();
        amazon.chooseCandidatesForInterview();
        microsoft.chooseCandidatesForInterview();

    }
}
