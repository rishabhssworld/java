package oops;

public class Inhertitence 
{
    public static void main(String[] args)
    {
        Mammals m1 = new Mammals();
        m1.tail = 5;
        m1.kind();
        m1.legs();
        m1.name = "panku";

    }
    
}

class Animal
{
    void kind()
    {
        System.out.println("it is an animal");
    }
}
class Dog extends Animal
{
    int tail;
    void legs()
    {
        System.out.println("4 legs");
    }

}
class Mammals extends Dog
{
    String name;
}
