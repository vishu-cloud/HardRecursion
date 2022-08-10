import java.util.*;


public class incSeqLenK {
    public static void solve(int n,int k,int curr,ArrayList<Character> str)
    {
        if(k==0)
        {
            System.out.println(str);
            return;
        }
        else {
            for (int i = curr; i <= n; i++) {
                char c = Character.forDigit(i, 10);
                str.add(c) ;
                str.add(' ') ;
                solve(n, k - 1, i + 1, str);
                str.remove(str.size()-1);
                str.remove(str.size()-1);
            }
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Character> str = new ArrayList<>();
        solve(n,k,1,str);
    }
}
