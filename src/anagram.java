import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class anagram
{
    public static void main(String args[])
    {
        String str1,str2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        str1 = scanner.nextLine();
        System.out.println("Enter the Second String : ");
        str2 = scanner.nextLine();
        if(str1.length() != str2.length())
        {
            System.out.println("Given String Length is Not Same so Is Not Anagram");
        }
        else
        {
            char[] s1 = str1.toLowerCase().toCharArray();
            char[] s2 = str2.toLowerCase().toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            System.out.println("");
//            System.out.println(s1);
//            System.out.println(s2);
            if(Arrays.equals(s1,s2))
            {
                System.out.println("The Given String Is Anagram ");
            }
            else
            {
                System.out.println("The Given String Is not Anagram");
            }
        }
    }
}
