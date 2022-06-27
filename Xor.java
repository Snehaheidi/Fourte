import java.util.Scanner;

public class Xor
{
    public static void main(String args[])
    {
        int result,max=0,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Value : ");
        n = scanner.nextInt();
        int value[] = new int[n];
        System.out.println("Enter the Value");
            for(int i=0;i<n;i++)
            {
               value[i] = scanner.nextInt();
            }
//            System.out.println("The Value is "+value);
            for(int j=0;j<value.length;j++)
            {
                for(int k=j+1;k<value.length;k++)
                {
                    result = value[j]^value[k];
                    if(result>max)
                    {
                        max=result;
                    }
                }
            }
        System.out.println("The Maximum Value is : "+max);
        }
}
