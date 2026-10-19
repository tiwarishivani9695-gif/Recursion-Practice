import java.util.*;
public class Q5 {
    static int sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt()));
    }
}
