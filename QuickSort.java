import java.util.Scanner;

public class QuickSort {
    public static void quicksort(int arr[] , int start, int end){
        if (start<end){
            int pivot = partition(arr,start,end);   //calling the method
            quicksort(arr,start,pivot-1);
            quicksort(arr, pivot+1,end);

        }
    }
    public static int partition(int arr[],int p,int q){
        int pivot = q;
        int i = p-1;
        for (int j = p; j <q; j++) {
            if (arr[j]<arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        return i;
    }
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of array: ");
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}
