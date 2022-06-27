import java.util.Scanner;

public class Word
{
        Scanner scanner=new Scanner(System.in);
        String str1;
        String str2;
        String large,small;
        public void getStrings()
        {
            System.out.println("Enter 1st string : ");
            str1=scanner.next();
            System.out.println("Enter 2nd string : ");
            str2=scanner.next();
            compare(str1,str2);
        }
        public void compare(String s1,String s2)
        {
            if(s1.length()<s2.length())
            {
                large=s2;
                small=s1;
            }
            else
            {
                large=s1;
                small=s2;
            }
            for(int i=0;i<large.length();i++)
            {
                for(int j=0;j<small.length();j++)
                {
                    if(large.charAt(i)==small.charAt(j))
                    {
                        large=large.substring(0,i)+large.substring(i+1);
                    }
                }
            }
        }
        public void display()
        {
            System.out.println("Resultant String : "+large);
        }

}
