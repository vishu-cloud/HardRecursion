import java.util.*;

public class palidrome {
    public static boolean recursiveCheck(int x,int n,int mainnum)
    {
        if(n == 0)
        {
            return mainnum == x;
        }
        int last = n%10;
        n = n/10;
        x = x*10+last;
        return recursiveCheck(x,n,mainnum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursiveCheck(0,n,n));
    }
}
