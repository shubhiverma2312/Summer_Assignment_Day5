import java.util.*;
class q18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i,j,f,r,sum=0;
        for(i=n;i!=0;i=i/10)
        {
            r=i%10;
            f=1;
            for(j=1;j<=r;j++)
            {
                f=f*j;
            }
            sum=sum+f;
        }
        if(sum==n) System.out.println("STRONG NUMBER");
        else System.out.println("NOT A STRONG NUMBER");
    }
}