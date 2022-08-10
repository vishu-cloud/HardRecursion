import java.util.*;

public class CombinationStringDigits {
    public static void solve(String str,int i,String temp,int n)
    {
        if(i==n)
        {
            System.out.println(temp);
            return;
        }
        solve(str,i+1,temp+' '+str.charAt(i),n);
        solve(str,i+1,temp+str.charAt(i),n);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        temp+=str.charAt(0);
        solve(str,1,temp,str.length());
    }
}
