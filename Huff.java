import java.util.Scanner;
public class Huff {
    String value = "";
    public void Man() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value :");
        value = scanner.nextLine(); //110101111  --> CBE
        decode(value);
    }
    public void decode(String value)
    {
        String answer ="",result = "", temp = "";
        String[] str = new String[value.length()];
        for (int i=0;i<value.length();i++) {
            str[i] = String.valueOf(value.charAt(i));
        }
        for (int i=0;i<str.length;i++)
        {
            //System.out.println(str[i]);
          result = temp + str[i];
            //System.out.println(result);
          if(result.equals("0"))
          {
              //System.out.println(result);
              answer +="A";
              result = "";
              temp = "";
          }
          else if(result.equals("10"))
          {
              answer +="B";
              result = "";
              temp = "";
          }
         else if(result.equals("110"))
          {
              answer +="C";
              result = "";
              temp = "";
          }
          else if(result.equals("1110"))
          {
              answer +="D";
              result = "";
              temp = "";
          }
          else if(result.equals("1111"))
          {
              answer +="E";
              result = "";
              temp = "";
          }
          else
          {
              temp +=str[i];
          }
      }
        System.out.println(answer);
        System.out.println("- - - - - - - - - - - - - - - - -- - - -");
    }
}
