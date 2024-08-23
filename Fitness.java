import java.util.Scanner;
public class Fitness{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        int w = sc.nextInt();
        System.out.println("Enter the height: ");
        double h = sc.nextDouble();
        double B = w/(h*w);
        System.out.println("Your BMI is " + B);
    }
}