package lab1Task1;

public class Student
{
    private String name;
    private double grade;

    public Student(String name, double grade)
    {
        this.name = name;
        this.grade = grade;
    }

    public Student()
    {

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }

    public double getGrade()
    {
        return  grade;
    }
}
