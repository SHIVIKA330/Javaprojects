import java.util.Scanner;
public class ExampleHasNext{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Start ....");
while(sc.hasNextInt()){
String str = sc.next();
System.out.println("Entered value : " + str);
}}}

