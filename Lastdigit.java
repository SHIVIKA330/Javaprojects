import java.util.Scanner;
public class Lastdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int a = num1 % 10;
        int b = num2 % 10;
        if(a==b){
            System.out.println("True");
        }
        else
        System.out.println("False");


    }}
