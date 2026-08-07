public class Constructorex
{
   private int a;
    Constructorex(int a)
    {
        this.a=a;
 
        System.out.println("constructor is called");
    
    }
    public static void main(String args[])
    {
       Constructorex obj=new Constructorex(23);
       System.out.println(obj.a);
 

    }
}