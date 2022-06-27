import java.util.Scanner;
public class Ques4 {
    int n;

    public void triple() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        n = s.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the Numbers : ");
        for (int l = 0; l < n; l++) {
            nums[l] = s.nextInt();
        }
        value(nums);
    }
    public void value(int nums[]) {

        int i, j, k;
        for (i = 0; i < nums.length; i++)
        {
            for (j = i + 1; j <=nums.length - i - 1; j++)
            {
                for (k = j + 1; k <=nums.length - i - 1; k++)
                {
                    if ((i != j) && (i != k) && (j != k))
                    {
                        if (nums[i] + nums[j] + nums[k] == 0)
                        {
                            System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
                        }
                    }
                }
            }
        }
    }
}

