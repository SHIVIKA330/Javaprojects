import java.util.Scanner;
public class Library{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title: ");
        String str = sc.nextLine();
        System.out.println("Enter the author: ");
        String str2 = sc.nextLine();
        System.out.println("Enter the number of copies: ");
        int n = sc.nextInt();
        System.out.println("Book: " + str + " by " + str2 + ", " + n + " copies available ");

    }
}