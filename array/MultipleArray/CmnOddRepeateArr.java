package MultipleArray;

import java.util.Scanner;

public class CmnOddRepeateArr {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = scanner.nextInt();
        }

        int n1 = scanner.nextInt();
        int b[] = new int[n1];

        for(int i=0;i<n1;i++)
        {
            b[i] = scanner.nextInt();
        }

        // int i = 0;
        // int j = 0;
        int count = 0;

        // while(i < n && j < n1)
        // {
        //     if(a[i] == b[j])
        //     {
        //         if(a[i] % 2 != 0)
        //         {
        //             System.out.print(a[i] + " ");
        //             count++;
        //         }
        //         i++;
        //         j++;
        //     }
        //     else if(a[i] < b[j])
        //     {
        //         i++;
        //     }
        //     else
        //     {
        //         j++;
        //     }
        // }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++)
            {
                if(a[i]==b[j] && a[i]%2!=0)
                {
                   System.out.print(a[i] + " ");
                    count++; 
                    break;
                }
            }
        }

        if(count == 0)
        {
            System.out.print("No common odd elements found.");
        }
    }
}
