import java.util.Scanner;
public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) 
        {
            System.out.println(str + "is a palindrome");
        } 
        else 
        {
            System.out.println(str + "Not a palindrome");
        }
    }
}