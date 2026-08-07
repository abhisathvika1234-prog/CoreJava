public class ThisExample {
    private int a;
    private int b;
    ThisExample(int i,int j)
        {
            this.a=i;
            this.b=j;
            //here this is act like entire object refernce to the constructor//
            add(this);   
        }
        void add(ThisExample t)
        {
            t.a+=3;
            t.b+=1;
            System.out.println(t.a+ " "+t.b);
        }
    public static void main(String args[])
    {
        ThisExample obj=new ThisExample(1,2);
        

        
    }
}