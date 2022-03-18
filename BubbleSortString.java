import java.awt.*;
import java.util.Scanner;

public class BubbleSortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str[] = new String[s.length()];//{"Vivek","Lokes","Aman","Deepak"};
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        String temp;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length-1-i; j++) {
                if (str[j].compareTo(str[j+1])>0){
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}

