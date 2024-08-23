import java.util.Scanner;
public class Bus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        int d = sc.nextInt();
        System.out.println("Enter the fare per kilometer: ");
        double f = sc.nextDouble();
        double fare = sc.nextDouble();
        System.out.println("Your total fare for the trup is " + fare + ".");    }}
