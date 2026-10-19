import java.util.*;
public class Q2 {
    static void print(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        print(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(sc.nextInt());
    }
}
