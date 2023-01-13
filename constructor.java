package oops;

public class constructor 
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Rishabh");
        Student s3 = new Student(6);

    }
    
}
class Student
{
    int roll;
    String name;

    //non parameterized constructor
    Student()
    {
        System.out.println("no info is available for this student");
    }

    //parameterized constructor
    Student(String name)
    {
        this.name = name;
        System.out.println(name);
    }

    //parameterized constructor
    Student(int rollnumber)
    {
        rollnumber = roll;
    }
}
