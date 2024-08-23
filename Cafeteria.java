import java.util.Scanner;
public class Cafeteria {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Name: ");
String name = sc.nextLine();
System.out.println("Item: ");
String item = sc.nextLine();
System.out.println("Quantity: ");
int quantity = sc.nextInt();
System.out.println("Price: ");
double price = sc.nextDouble();

System.out.println(name + ", your total for " + quantity + item + " is $" + price);
sc.close();}}

\\System.out.println("Output: \"" + name);
\\to print double quotes in printing statement