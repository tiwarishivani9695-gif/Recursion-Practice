import java.util.*;
public class Q20 {
    static String remove(String s, char c, int i) {
        if (i == s.length()) return "";
        String rest = remove(s, c, i + 1);
        if (s.charAt(i) == c) return rest;
        return s.charAt(i) + rest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(remove(s, c, 0));
    }
}
