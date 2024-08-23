import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number");
        int num2 = scanner.nextInt();
        System.out.println("Enter a number");
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}