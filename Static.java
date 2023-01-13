package oops;

public class Static 
{
    public static void main(String[] args)
    {
        Studentt s1 = new Studentt();
        s1.schoolname="dsps";
        System.out.println(s1.schoolname);

        //we are not defining a school name for student s2, as it is static so it will be const for all
        Studentt s2 = new Studentt();
        System.out.println(s2.schoolname);
    }
    
}
class Studentt
{
    static String schoolname;
    int roll;
    String name;

    void SetName(String name)
    {
        this.name = name;
    }
    String getname()
    {
        return name;
    }
}
