import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите номер: ");
        int n = scan.nextInt();
        System.out.println(Factorial(n));
    }

    public static int Factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}



