package oops;
/*Interface
 * all methods are public,abstract and without implemntation
 * used to achieve total abstraction
 * variables in the interface are final,public and static
 */
public class Interfaces 
{
    public static void main(String[] args)
    {
        Queen q1 = new Queen();
        q1.moves();

    }
    
}

interface Chessplayer
{
    void moves();
}
class Pawn implements Chessplayer
{
    public void moves()   // should be public 
    {
        System.out.println("up,down");
    }
}
class Queen implements Chessplayer
{
    public void moves()
    {
        System.out.println("up,down,diagonal");
    }
}

//multiple inheritence

interface Herbivores
{
    void eat();
}
interface Carnivores
{
    void Eat();
}
class Bears implements Herbivores,Carnivores{
    public void eat()
    {

    }
    public void Eat()
    {

    }
}
