import java.util.*;

public class firstLastSame {
    public static void solve(String str,int i,char c,String temp,int n)
    {
        if(i==n)
            return;
        temp+=str.charAt(i);
       if(c == str.charAt(i))
           System.out.println(temp);
       solve(str,i+1,c,temp,n);
       return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            solve(str,i,str.charAt(i),"",str.length());
        }
    }
}
