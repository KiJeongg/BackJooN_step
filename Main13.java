//백준 10813 문제

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 바꾸는 횟수

        int[] basket = new int[N + 1]; // 1번부터 쓸 거니까 N+1

        // 바구니에 번호대로 공 채워놓기
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        // 공 바꾸기
        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            // i와 j 바구니의 공을 서로 교환
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }

        sc.close();
    }
}