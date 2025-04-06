//백준 2884문제
//알람시계
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();


        if (M < 45) {
            H--;
            M = M + 60 - 45;

            if (H < 0) {
                H = 23;
            }
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);

    }
}