import java.util.Scanner;

public class Functions {

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        long f = 1L;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; (long) i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Functions demo");
            System.out.println("1) Factorial");
            System.out.println("2) Prime check");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");
            String line = sc.nextLine().trim();
            int opt;
            try {
                opt = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println("Invalid input.\n");
                continue;
            }
            if (opt == 0) break;
            switch (opt) {
                case 1:
                    System.out.print("Enter non-negative integer: ");
                    try {
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(n + "! = " + factorial(n) + "\n");
                    } catch (Exception e) {
                        System.out.println("Invalid number.\n");
                    }
                    break;
                case 2:
                    System.out.print("Enter integer: ");
                    try {
                        int n = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(isPrime(n) ? "Prime\n" : "Not prime\n");
                    } catch (Exception e) {
                        System.out.println("Invalid number.\n");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }
        sc.close();
        System.out.println("Goodbye.");
    }
}