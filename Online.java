import java.util.Scanner;
public class Online{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product 1: , Quantity: , Price: ");
        String str1 = sc.nextLine();
        int n1 = sc.nextInt();
        double d1 = sc.nextDouble();
        System.out.println("Enter the product 2: , Quantity: , Price: ");
        String str2= sc.nextLine();
        int n2 = sc.nextInt();
        double d2 = sc.nextDouble();
        System.out.println("Enter the product 3: , Quantity: , Price: ");
        String str3 = sc.nextLine();
        int n3 = sc.nextInt();
        double d3 = sc.nextDouble();  
        double s = d1 + d2 + d3;
        System.out.println("Total amount for your cart is: " + s);  }}
