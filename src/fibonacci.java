import java.util.Scanner;

public class fibonacci
{
    public static void main(String args[])
    {
        int n,result;
        int n1 = 0,n2=1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(n1+"\n"+n2);
        for(int i=0;i<n-2;i++)
        {
            result = n1+n2;
            n1 = n2;
            n2 = result;
            System.out.println(result);
//            if()
//            {
//
//            }
        }
    }
}
