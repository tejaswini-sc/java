import java.util.Scanner;

public class AllPosibleSubarray {

     static void printAllSubarrays(int[] arr) {
        for(int size=1;size<=arr.length;size++)
        {
            for(int i=0;i<arr.length-size;i++)
            {
                for(int j=i;j<i+size;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printAllSubarrays(arr);
    }
}
