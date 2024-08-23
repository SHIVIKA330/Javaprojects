import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = scanner.nextInt();
        int orgnum = num;
        int sum = 0;
        while(num!=0){
            int digit = num % 10;
            sum += Math.pow(digit,3);
            num /= 10;
        }
        if (sum == orgnum) {
            System.out.println(orgnum + "is an armstrong  number.");
        }
        else {
            System.out.println(orgnum + "is not a armstrong number");
        }
        }
        }
    