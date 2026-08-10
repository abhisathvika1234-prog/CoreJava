
public class ConstructorChaining {
    //One constructor can call another constructor in the same class using this()
    String name;
    int num;
   ConstructorChaining()
   {
    System.out.println("this is first name");
      this("abhi");

   }
   ConstructorChaining(String name)
   {

   }
   ConstructorChaining(String name,int num)
   {

   }




    public static void main(String args[])
    {
        

    }
}
