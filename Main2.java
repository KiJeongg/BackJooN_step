//백준   2753번
//윤년이면 1 아니면 0 출력

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}