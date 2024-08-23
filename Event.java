import java.util.Scanner;
public class Event{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the last name: ");
        String str2 = sc.nextLine();
        System.out.println("Enter your email: ");
        String str3 = sc.nextLine();
        System.out.println("Thank you, " + str1 + " " + str2 + ". Your registration is complete. Confirmation sent to " + str3 + ". ");
    }
}