import java.util.*;
class q17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i,sum=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0) sum=sum+i;
        }
        if(sum==n) System.out.println("PERFECT NUMBER");
        else System.out.println("NOT A PERFECT NUMBER");
    }
}