import java.util.Scanner;

public class BTwithoutconsecutiveones {
    public static void fun(int k, String str,int prev)
    {
        if(str.length() == k)
        {
            System.out.println(str);
            return;
        }
        if(prev == 1)
        {
            fun(k,str+"0",0);
        }
        else
        {
            fun(k,str+"0",0);
            fun(k,str+"1",1);
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int k = sc.nextInt();
        fun(k,"",2);
    }
}
