package String;

public class shortestdistance 
{
    public static float shortestdistance(String str)
    {
        int x=0;
        int y=0;
        for(int i =0;i<str.length();i++)
        {
            //north
            if(str.charAt(i)== 'N')
            {
                y++;
            }
            //south
            else if(str.charAt(i)== 'S')
            {
                y--;
            }
            //east
            else if(str.charAt(i)== 'E')
            {
                x++;
            }
            //west
            else
            {
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
        
    }
    public static void main(String[] args)
    {
        String str="WNEENESENNN";
        System.out.println(shortestdistance(str));
    }
    
}
