public class Factorial {
    public static void main(String args[])
    {
        int fact=1;
        int num=5;
        if(num<0)
        {
            System.out.println("the number is negative");
        }
        else
        {
             for(int i=1;i<=num;i++)
        {
            fact=fact*i;
           
        }
         System.out.println(fact);

        }
       
        
    }
}
