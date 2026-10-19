import java.util.*;
public class Q12 {
    static int count(long n) {
        if (n < 10) return 1;
        return 1 + count(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.nextLong()));
    }
}
