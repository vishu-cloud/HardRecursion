import java.util.*;

public class sortedArrayOfAlterElem {
    public static void solve(int A[], int B[], int i, int j, int flag, ArrayList<Integer> arr)
    {
        if((i >= A.length && flag ==1)||(j >= B.length && flag ==2))
        {
            System.out.println(arr);
            return;
        }
        System.out.println(arr);
        if(flag == 1)
        {
            if(arr.size() <= 0)
            {
                arr.add(A[i]);
                solve(A,B,i+1,j,2,arr);
            }
            else
            {
                for (; i < A.length; i++) {
                    if(A[i]> arr.get(arr.size()-1))
                    {
                        arr.add(A[i]);break;
                    }
                }
                solve(A,B,i+1,j,2,arr);
            }

        }
        else
        {
            if(arr.size() == 0)
            {
                arr.add(B[j]);
            }
            else
            {
                for (; j < B.length; j++) {
                    if(B[j]> arr.get(arr.size()-1))
                    {
                        arr.add(B[j]);break;
                    }
                }
            }
            solve(A,B,i,j+1,1,arr);
        }
        return;
    }

    public static void main(String args[])
    {
        int A[] = {10,15,25};
        int B[]={1,5,20,30};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int k = 0;k<A.length;k++)
        solve(A,B,k,0,1,arr);
    }
}
