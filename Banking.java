import java.util.Scanner;
public class Banking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your initial balance: ");
        double ib = sc.nextDouble();
        System.out.println("Enter your withdraw: ");
        double w = sc.nextDouble();
        System.out.println("Enter your ur deposit: ");
        double d = sc.nextDouble();
        double b = ib - (w - d);
        System.out.println("Your new balance is $" + b + ".");


    }

}
