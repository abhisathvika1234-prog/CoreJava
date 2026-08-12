public class Max2DArray {
   
    public static void main(String args[])
    {
        int[][] arr = {
    {10, 50, 30},
    {80, 20, 60},
    {40, 90, 70}
};
int max=0;
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[i].length;j++)
    {
        if(arr[i][j]>max)
        {
            max=arr[i][j];
        }
    }
}
System.out.println(max);
    }
}
