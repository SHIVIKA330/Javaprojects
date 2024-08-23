import java.util.Scanner;
public class School{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Enter your marks: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        double avg = a1+a2+a3/3;
        System.out.println(s + ", your average mark is " + avg + ". You passed.");

    }}