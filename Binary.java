import java.util.Arrays;
import java.util.Scanner;
public class Binary{
    public static void main(String[] args){
        int[] arr = {2, 4, 0, 1, 9};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        int result = binarySearch(arr,key);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + result);

        }
        }
        public static int binarySearch(int[] arr, int key){
            int left = 0;
            int right = arr.length - 1;
            while (left<=right){
                int mid = left+(right-left)/2;
                if(arr[mid] == key){
                    return mid;
                }
                if(arr[mid] < key){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
