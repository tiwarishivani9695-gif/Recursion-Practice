import java.util.*;
public class Q11 {
    static int product(long n) {
        if (n == 0) return 0;
        if (n < 10) return (int)n;
        return (int)(n % 10) * product(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(product(sc.nextLong()));
    }
}
