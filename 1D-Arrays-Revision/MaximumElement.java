public class MaximumElement {
    public static void main(String args[])
    {
        int[] arr = {10, 50, 20, 80, 30};
        int findmax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>findmax)
            {
                findmax=arr[i];
            }

        }
        System.out.println(findmax);
    }
}
