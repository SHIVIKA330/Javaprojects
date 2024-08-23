

public class Sumofinte {
    public static void main(String[] args) {
if(args.length >=2){

        String str1= args[0];
        String str2 = args[1];
        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);
        int a = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + a);}

    }
}