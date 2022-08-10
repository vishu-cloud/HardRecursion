import java.util.*;

public class problem2 {
    public static void recursiveprint(char[] Set, int k,int m,ArrayList<String> ds,String Str)
    {
        if(m == k)
        {
            ds.add(Str);
            return;
        }
        for(int i = 0;i<Set.length;i++) {
            Str += Set[i];
            recursiveprint(Set, k, m+1, ds, Str);
        }
    }
    public static void prblm2(char[] Set, int k)
    {
        int m = 0;
        ArrayList<String> ds = new ArrayList<>();
        String Str = "";
        recursiveprint(Set,k,m,ds,Str);
        for(int i =0;i< ds.size();i++)
            System.out.println(ds.get(i));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] Set = new char[n];
        for(int i=0;i<n;i++)
        {
            Set[i] = sc.next().charAt(0);
        }
        int k = sc.nextInt();
        prblm2(Set,k);
    }
}
