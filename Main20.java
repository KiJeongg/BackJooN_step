//백준 3003번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] correct = {1,1,2,2,2,8};
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<6; i++) {
            int dif = correct[i] - Integer.parseInt(input[i]);
            sb.append(dif).append(" ");
        }
        System.out.println(sb);


    }

}
