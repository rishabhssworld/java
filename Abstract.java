package oops;

public class Abstract 
{
    public static void main(String[] args)
    {
        Fish f1 = new Fish();
        f1.walk();
        //f1.eat();

        Hen h1 = new Hen();
        h1.walk();
        //h1.eat();
    }  
}
/*abstract class
- we can't make an object (to call that in the main function)
-just to provide an idea not the complete implementation for the inheriting classes
-can have abstract or non-abstract method */

abstract class Animal
{
    void eat()
    {
        System.out.println("this animal eats");
    }

    abstract void walk();       // this function is must to be included in the inheriting classes
} 

class Fish extends Animal 
{
    void walk()
    {
        System.out.println("don't walk");
    }
}

class Hen extends Animal{
    void walk()
    {
        System.out.println("walk on 2 legs");
    }
}
