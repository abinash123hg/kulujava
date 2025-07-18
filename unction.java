import java.util.*;

public class unction {
    public static long Power(long x, long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your x or base: ");
        long x = sc.nextLong();
        System.out.print("Enter your n or exponent: ");
        long n = sc.nextLong();

        long result = Power(x, n);
        sc.close();

        System.out.println("Result is: " + result);
    }
}
