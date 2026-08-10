public class FindElement {
    public static void main(String args[])
    {
        int[] arr={10,20,30,40,50};
        boolean ans=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==30)
            {
                ans=true;
                break;
            }
        }
        if(ans)
        {
            System.out.println("30 found");
        }
        else
        {
            System.out.println("30 not found");
        }          
    }
}
