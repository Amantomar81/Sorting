import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
     }
}
