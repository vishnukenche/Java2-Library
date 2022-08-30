import java.util.*;

class exception1
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("please enter first number");
        int no1=sobj.nextInt();

        System.out.println("please enter second number");
        int no2=sobj.nextInt();

        int ans=no1/no2;

        System.out.println("Division is :"+ans);

    }
}