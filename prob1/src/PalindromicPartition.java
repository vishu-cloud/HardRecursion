import java.util.*;

public class PalindromicPartition {
        public static void solve(String str,int i,int n,String t)
        {
            if(n==i)
            {
                System.out.println(t);
                return;
            }
            String temp =t;
            char c = str.charAt(i);
            temp+=c;
            int j =i+1;
            for(;j<n;j++)
            {
                if(str.charAt(j) == c)
                {
                    solve(str,j,n,temp);
                }
                else
                    temp+=str.charAt(j);
            }
            String temp2 = t+ c+' ';
            solve(str,i+1,n,temp2);
            return;
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            solve(str,0,str.length(),"");
        }
}


