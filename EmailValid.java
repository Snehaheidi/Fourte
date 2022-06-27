import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValid
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String Email;
        System.out.println("Enter the mobile number");
        Email = scanner.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@[a-z]+(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(Email);
        boolean result = match.matches();
        if(result)
        {
            System.out.println("Given Mail Id is Valid");
        }
        else
        {
            System.out.println("Not valid");
        }
    }
}
