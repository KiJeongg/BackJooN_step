//백준 10807번

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i =0; i<a; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        int count = 0;
        for (int i =0; i<a; i++) {
            if (arr[i]==b) {
                count ++;
            }
        }
        System.out.println(count);

    }

}
