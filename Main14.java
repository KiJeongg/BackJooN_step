//백준 3052번
//HashSet
import java.util.HashSet;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<10; i++) {
            int num = sc.nextInt();
            int remainder =  num % 42;
            set.add(remainder);
        }
        System.out.println(set.size());
    }
}