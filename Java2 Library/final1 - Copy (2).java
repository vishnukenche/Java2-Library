import java.lang.*;

class demo
{
    public int i;
    public final int j=20;
    public final int k;

    public demo()
    {
        this.i=10;
        this.k=30;
    }
    public demo(int i,int k)         // overloading & constructor
    {
        this.i=i;
        this.k=k;
    }

    public void fun()
    {
        i++;           // allowed
        // j++;           // not allowed
        // k++;           // not allowed
    }
}
 
class final1
{
    public static void main(String arg[])
    {
        demo obj1=new demo();
        obj1.fun();
        System.out. println(obj1.i);     // 11
        System.out. println(obj1.j);     // 20
        System.out. println(obj1.k);     // 30

        demo obj2=new demo(11,21);
        obj2.fun();           
        System.out. println(obj2.i);     // 11 + 1 = 12
        System.out. println(obj2.j);     // 20
        System.out. println(obj2.k);     // 21
    }
}