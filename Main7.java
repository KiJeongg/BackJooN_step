//백준 25314번

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int count = a/4;

        for(int i =4; i<count; i++){
            System.out.println("long");
        }
        System.out.println("int");
    }

}
