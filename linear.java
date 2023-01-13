package array;

public class linear 
{
    public static int LinearSearch(int marks[], int key)
    {
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==key)
            {
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int marks[] = {1,2,3,4,5,6,7,8,9};
        int key = 9;

        int index = LinearSearch(marks, key);
        if(index==-1)
        {
            System.out.println("index not found");
        }
        else{
            System.out.println("index is"+index);
        }


    }
    
}
