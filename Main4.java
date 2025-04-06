//백준 2525번 문제
// 오븐시계

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        B +=C;

        if (B>=60) {
            A += B/60;
            B = B % 60;
        }
        if (A>=24) {
            A = A% 24;
        }
            System.out.println(A+" "+B);
    }
}
