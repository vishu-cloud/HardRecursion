import java.util.*;


public class SumNPowerNatNum {
    public static int solve(int x,int n,int sum,int i)
    {

        if(sum>x || i>x )
        {
            return 0;
        }
        if(sum==x) {
            return 1;
        }
        int sum1 = 1;
        for(int j =0;j<n;j++)
            sum1*=i;
        sum1+=sum;
         return solve(x,n,sum1,i+1) + solve(x,n,sum,i+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if(x == 1)
            System.out.println(1);
        else{
            int c = solve(x,n,0,1);
            System.out.println(c);
        }
    }
}
