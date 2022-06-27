import java.util.Scanner;

public class NumberRoman
{
    public void getValue()
    {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int number=scan.nextInt();
            conversionToRoman(number);
        }
        public void conversionToRoman(int number)
        {
            int number_array[]={1000,500,100,50,10,5,1};
            String roman[]={"M","D","C","L","X","V","I"};
            String romanLetters="";
            for (int i = 0; i < number_array.length; i++)
            {
                while (number >= number_array[i])
                {
                    number -= number_array[i];
                    romanLetters += roman[i];
                }
            }
            System.out.println("RomanLetters : "+romanLetters);
        }
}
