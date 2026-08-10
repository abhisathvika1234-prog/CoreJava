public class MinimumInArray {
    public static void main(String args[])
    {
        int[] arr = {45, 12, 78, 23, 9, 6};
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            
        }
        System.out.println(min);

    }
}
