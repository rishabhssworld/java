package oops;

public class bsics 
{
    public static void main(String[] args)
    {
        pen p1 = new pen();
        System.out.println(p1.company);

        tip t1 = new tip();
        t1.settip(5);
        System.out.println(t1.tip);
        t1.tip = 5;
        System.out.println(t1.tip);

    }
    
}

class pen
{
    String company = "reynolds";

}

class tip
{
    int tip;

    void settip(int newtip)
    {
        tip = newtip;
    }

}