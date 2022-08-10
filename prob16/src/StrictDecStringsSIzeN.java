import java.util.*;

public class StrictDecStringsSIzeN {
    public static void solve(ArrayList<String> ans,int n,String str,int i)
    {
        if(str.length() == n)
        {
            ans.add(str);
            return;
        }
        for (int j = i; j < 10; j++) {
            solve(ans,n,str+Character.forDigit(j,10),j+1);
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            ArrayList<String> ans = new ArrayList<>();
            solve(ans,n,"",0);
        System.out.println(ans);
    }
}
