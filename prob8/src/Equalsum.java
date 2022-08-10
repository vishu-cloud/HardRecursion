import java.util.Scanner;

public class Equalsum {
    public static void recursiveApproach(int n, String right, String left,int sumL,int sumR)
    {
        if(n==0)
        {
            if(sumL == sumR)
            System.out.println(left+right);
            return;
        }
        else if(n==1)
        {
            if(sumL == sumR)
            {System.out.println(left+"0"+right);
            System.out.println(left+"1"+right);}
            return;
        }
        else
        {
            recursiveApproach(n-2,right+"0",left+"0",sumL,sumR);
            recursiveApproach(n-2,right+"1",left+"1",sumL+1,sumR+1);
            recursiveApproach(n-2,right+"0",left+"1",sumL+1,sumR);
            recursiveApproach(n-2,right+"1",left+"0",sumL,sumR+1);
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiveApproach(n,"","",0,0);
    }
}
