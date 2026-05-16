package array;
import java.util.Scanner;

public class AllSubequalToK {

    static void subarrayOfSize(int[]arr, int size) {
        for(int i=0;i<arr.length-size;i++)
        {
            for(int j=i;j<i+size;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		subarrayOfSize(arr,size);
    }
}
