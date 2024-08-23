import java.util.Scanner;
public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        String str = sc.nextLine();
        System.out.println("Enter the movie ticket: ");
        int n = sc.nextInt();
        System.out.println("Enter the price: ");
        double p = sc.nextDouble();
        System.out.println("Total cost for " + n + "tickets to " + str + " is $" + p + "Enjoy the movie!");
        
    }}
