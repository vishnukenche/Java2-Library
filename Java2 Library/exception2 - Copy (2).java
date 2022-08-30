import java.util.*;

class exception2
{
    public static void main(String arg[])
    {
        int ans=0,no1=0,no2=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("please enter first number");
        no1=sobj.nextInt();

        System.out.println("please enter second number");
        no2=sobj.nextInt();

        try
        {
            ans=no1/no2;      // exception prone code
        }
        catch(ArithmeticException obj)
        {
            System.out.println("exception occured as:"+obj );
        }
        finally
        {
            sobj.close();
        }

        System.out.println("Division is :"+ans);

    }
}