import java.util.Scanner;

public class Divisable
{
    public static void main(String args[])
    {
        int sum,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Our Sum value : ");
        sum = scanner.nextInt();
        System.out.println("Enter the Number of element:");
        n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("The Element is :");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int result;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++)
            if (arr[i] < arr[j]) {
              result = arr[i]+arr[j];
              int answer = result%sum;
              if(answer == 0)
              {
                  System.out.println(arr[i]+","+arr[j]);
              }
            }
        }
    }
}

