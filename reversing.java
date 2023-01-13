package array;

public class reversing 
{
    public static void reverse(int marks[])
    {
        int first =0, last = marks.length-1;
        //swapping
        while(first<last)
        {
        int temp = marks[last];
        marks[last] = marks[first];
        marks[first] = temp;
        first++;
        last--;
        }
    }
    public static void main(String[] args)
    {
        int marks[]={1,2,3,4,5};
        reverse(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]);
        }
        System.out.println();

    }
    
}
