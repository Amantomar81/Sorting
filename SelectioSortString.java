import java.util.Scanner;

public class SelectioSortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
       String[] str = new String[n];//{"Mukesh","Deepak","Aman","Vivek","Amit"};
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        String temp="";
        int min;
        for (int i = 0; i < str.length ; i++) {
            min = i;
            for (int j = i+1; j < str.length; j++) {
                if(str[j].compareTo(str[min])<0){
                    min = j;
                }
            }
            temp = str[i];
            str[i] = str[min];
            str[min] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
