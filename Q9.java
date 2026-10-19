import java.util.*;
public class Q9 {
    static long reverse(long n, long result) {
        if (n == 0) return result;
        return reverse(n / 10, result * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc.nextLong(), 0));
    }
}
