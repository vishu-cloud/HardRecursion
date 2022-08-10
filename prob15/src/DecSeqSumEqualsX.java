import java.util.*;

public class DecSeqSumEqualsX {
    public static void solve(ArrayList<ArrayList<Integer>> ans,int x,int i,ArrayList<Integer> temp)
    {
        if(i==0|| x<i)
        {
            return;
        }
        int p = x;
        p-=i;
        if(p>0) {
            temp.add(p);
            temp.add(i);
            if(p>=i){
                ans.add(temp);}
            ArrayList<Integer> temp1 = new ArrayList<>(temp);
            temp1.remove(temp1.size() - 1);
            solve(ans, i, i - 1, temp1);
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < x; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            solve(ans,x,i,temp);
        }
        ArrayList<Integer> t = new ArrayList<>();
        t.add(x);
        ans.add(t);
        System.out.println(ans);
    }
}
