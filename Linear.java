import java.util.Scanner;
public class Linear{
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 1, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("E neter the element to search");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Elemnet found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }

    }
}



