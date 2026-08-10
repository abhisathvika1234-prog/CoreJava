public class CountOccurences {
    public static void main(String args[])
    {
        int[] arr = {10, 20, 10, 30, 20, 10, 40};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==10)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
