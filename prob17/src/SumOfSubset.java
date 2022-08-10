import java.util.ArrayList;

public class SumOfSubset {
    public static void solve(int arr[],int i,int sum)
    {
        if(i== arr.length)
        {
            System.out.println(sum+" ");
            return;
        }
        solve(arr,i+1,sum+arr[i]);
        solve(arr,i+1,sum);
        return;
    }
    public static void main(String args[])
    {
        int arr[] = {2,4,5};
        solve(arr,0,0);
    }
}
