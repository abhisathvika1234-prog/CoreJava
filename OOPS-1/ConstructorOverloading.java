

public class ConstructorOverloading {
    ConstructorOverloading()
    {
        System.out.println("hey hi this is Abhi Sathvika Reddy");
    }
    private int age;
     ConstructorOverloading(int a)
     {
        this.age=a;
        a+=2;
        System.out.println("currently my age is"+ age);
     }
     public static void main(String args[])
     {
         ConstructorOverloading con=new  ConstructorOverloading();
          ConstructorOverloading con1=new  ConstructorOverloading(21);
     }
    
}
