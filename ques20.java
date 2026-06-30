import java.util.*;
class q20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i,j,f,c,lpf=0;
        if(n==1) System.out.println("NO PRIME FACTORS");
        else
        {
            for(i=1;i<=n;i++)
            {
                f=n%i;
                c=0;
                if(f==0)
                {
                    for(j=2;j<=i;j++)
                    {
                        if(i%j==0) c++;
                    }
                }
                if(c==1&&i>lpf) lpf=i;
            }
        }
        System.out.println("LARGEST PRIME FACTOR:"+lpf);
    }
}