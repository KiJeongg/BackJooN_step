//백준 10810번

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];

        for (int t = 0; t < M; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int x = i; x <= j; x++) {
                basket[x - 1] = k;  
            }
        }

        for (int x = 0; x < N; x++) {
            System.out.print(basket[x] + " ");
        }
    }
}