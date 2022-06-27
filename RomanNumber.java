import java.util.Scanner;

public class RomanNumber {
    String roman = "";
    int i;
    public void getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Roman Number :");
        roman = scanner.nextLine(); //IV
        Roman(roman);
    }
    public void Roman(String roman) {
                int result=0;
                while(i<roman.length())
                {
                    char c=roman.charAt(i);
                    switch(c)
                    {
                        case 'I':
                            result=result+1;
                            break;
                        case 'V':
                            result=result+5;
                            break;
                        case 'X':
                            result=result+10;
                            break;
                        case 'L':
                            result=result+50;
                            break;
                        case 'C':
                            result=result+100;
                            break;
                        case 'D':
                            result=result+500;
                            break;
                        case 'M':
                            result=result+1000;
                            break;
                    }
                    i++;
                }
                System.out.println(result);
    }
}

