import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci series: " + a + " " + b);
        for (int i = 2;i < n;i++){
            int next = a+b;
            System.out.println(" " + next);
            a = b;
            b = next;
        }
    }
}