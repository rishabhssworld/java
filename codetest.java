package oops;
public class codetest 
{
    public static void main(String[] args)
    {
        A aa = new A();
        aa.gender();
    }
    
}
abstract class Boy
{
    void gender()
    {
        System.out.println("male");
    }

}

class A extends Boy{

}
