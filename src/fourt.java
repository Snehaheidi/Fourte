import java.util.Scanner;
import java.util.Stack;

public class fourt
{
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> arr = new Stack<>();
    int sum=0;
    public void getValue() {

        System.out.print("***Our Magic Number*** -> ");
        sum = scanner.nextInt();
        System.out.print("Get our Magic Number in Given Values : ");
        for(int i=0;i<4;i++)
        {
            arr.add(scanner.nextInt());
        }
    }
    int choice;
    public void value()
    {
        System.out.println("Enter your value : ");
        System.out.println("");
        System.out.println("1)\t"+arr.get(0)+"\t2)\t"+arr.get(1)+"\t3)\t"+arr.get(2)+"\t4)\t"+arr.get(3)+"");
        choice = scanner.nextInt();
//        for(int i=1;i<=choice;i++) {
//            if (choice == i) {
//                arr.remove(arr.get(i-1));
//            }
    }
    public void game()
    {
        int add = 0;
        char option = 0;
        do
        {
            Stack<Integer> result = new Stack<>();
            System.out.println("1)operator \t 2)value: ");
            int val = scanner.nextInt();
            switch (val)
            {
                case 1:
                    System.out.println("-->\t( \t + \t - \t % \t * \t ) \t");
                    option = scanner.next().charAt(0);
                    break;
                case 2:
                    value();
                    break;
            }
           switch(option)
           {
               case '(':
                   for(int i=1;i<=choice;i++)
                   {
                     result.add(arr.get(choice-1));
                   }
                   value();
                   break;
               case '+':
                   add = result.get(0);
                   value();
                   break;
               case '-':
                   System.out.println("");
                   break;
               case '%':
                   System.out.println("");
                   break;
               case '*':
                   System.out.println("");
                   break;
               case ')':
                   System.out.println("");
                   break;
               default:
                   System.exit(0);

           }

        }
        while(sum==add);
        System.out.println("");
    }
}
