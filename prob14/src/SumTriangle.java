public class SumTriangle {
    public static void solve(int arr[])
    {
        if(arr.length == 1)
        {
            System.out.println(arr[0]);
            return;
        }
        int temp[]=new int[arr.length-1];
        for(int i=0;i< arr.length-1;i++)
        {
            temp[i] = arr[i]+arr[i+1];
        }
        solve(temp);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }
    public static void main(String args[])
    {
        int arr[]= {1,2,3,4,5};
        solve(arr);
    }
}
