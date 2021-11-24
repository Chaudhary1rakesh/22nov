package first_java_programe;

import java.util.Arrays;
import java.util.Scanner;

public class nov_23third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Array element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The positive Integers of Array " + Arrays.toString(arr) + " is / are : " );
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0)
            System.out.println(arr[i]);
        }
        sc.close();
    }
}