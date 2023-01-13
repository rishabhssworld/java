package oops;

public class Copyconstructor 
{
    public static void main(String[] args)
    {
        SStudent s1 = new SStudent();
        s1.roll = 5;
        s1.name = "Rishabh";
        s1.password = "abcdef";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        SStudent s2 = new SStudent(s1);
        s2.password = "qwert";

        s1.marks[1]=100;
        for(int i=0; i<3; i++)
        {
            System.out.println(s2.marks[i]);
        }

    }
    
}

class SStudent 
{
    int roll;
    String name;
    String password;
    int[] marks;

    SStudent()
    {
        marks = new int[3];
    }

    SStudent(SStudent s1)
    {
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        this.marks = s1.marks;      
    }
}
