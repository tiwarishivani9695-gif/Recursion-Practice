import java.util.*;
public class Q18 {
    static long decimal(String s, int i) {
        if (i == s.length()) return 0;
        return (s.charAt(i) - '0') * (1L << (s.length() - 1 - i)) + decimal(s, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(decimal(sc.nextLine(), 0));
    }
}
