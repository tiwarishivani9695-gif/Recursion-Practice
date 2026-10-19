import java.util.*;
public class Q3 {
    static void print(int n) {
        if (n < 2) return;
        print(n - 1);
        if (n % 2 == 0) System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(sc.nextInt());
    }
}
