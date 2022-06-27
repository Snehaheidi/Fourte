import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValid
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String PhNum;
        System.out.println("Enter the mobile number");
        PhNum = scanner.nextLine();
        String regex = "(0/91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(PhNum);
        boolean result = match.matches();
        if(result)
        {
            System.out.println("Given Phone Number is Valid");
        }
        else
        {
            System.out.println("Not valid");
        }
    }
}
