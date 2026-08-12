public class Traversal2D {
    public static void main(String args[])
    {
        
        int[][] arr = {
    {10, 50, 30},
    {80, 20, 60},
    {40, 90, 70}
};
 boolean search=false;
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[i].length;j++)
    {
        if(arr[i][j]==50)
        {
            search=true;
        }
      
    }
}
if(search)
{
    System.out.println("50 found");
}
else
{
    System.out.println("50 not found");
}
    }
}

