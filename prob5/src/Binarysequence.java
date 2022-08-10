import java.util.*;

public class Binarysequence {
    public static void generateSequence(int n1,int n2,String str1,String str2,int sum1,int sum2)
    {
        if(n1 == 0 && n2 ==0)
        {
            if(sum1 == sum2)
            System.out.println(str1+str2);
            return;
        }
            generateSequence(n1-1,n2-1,str1+"0",str2+"0",sum1,sum2);
            generateSequence(n1-1,n2-1,str1+"1",str2+"1",sum1+1,sum2+1);
            generateSequence(n1-1,n2-1,str1+"1",str2+"0",sum1+1,sum2);
            generateSequence(n1-1,n2-1,str1+"0",str2+"1",sum1,sum2+1);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = "",str2="";
        generateSequence(n,n,str1,str2,0,0);
    }
}
