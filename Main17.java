// 10809번 백준
import java.util.Arrays;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

             String s = sc.next();
             int[] arr = new int[26];
             Arrays.fill(arr, -1);

             for(int i=0; i<s.length(); i++) {
                 char ch = s.charAt(i);
                 int index = ch-'a';

                if(arr[index]==-1) {
                    arr[index] =i;
                }
             }

             for(int i=0;i<26;i++) {
                 System.out.print(arr[i]+ " ");
             }

    }
}
