public class MinMax {
    public static void solve(int[] arr,int min,int max,int i)
    {
        if(i == arr.length)
        {
            System.out.println("Max value is:"+max);
            System.out.println("Min value is:"+min);
            return;
        }
        if(arr[i]>max)
            max = arr[i];
        if(arr[i]<min)
            min = arr[i];
        solve(arr,min,max,i+1);
          return;
    }
    public static void main(String args[])
    {
        int arr[]= {100,-1,1,2,3,5,3,7,9,4};
        solve(arr,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
    }
}
