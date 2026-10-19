import java.util.Scanner;

public class Q24 {
    static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int minRest = findMin(arr, index + 1);
        return Math.min(arr[index], minRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr, 0));
        sc.close();
    }
}
