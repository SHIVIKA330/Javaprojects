import java.util.Scanner;
public class Restaurant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the price: ");
        double p1 = sc.nextDouble();
        System.out.println("Enter the item2: ");
        String str2 = sc.nextLine();
        System.out.println("Enter the price: ");
        double p2 = sc.nextDouble();       
        System.out.println("Enter the item3: ");
        String str3 = sc.nextLine();
        System.out.println("Enter the price: ");
        double p3 = sc.nextDouble();
        double s = p1 + p2 + p3;
        System.out.println("Your total bill, including tax, is $" + s);


    }
}