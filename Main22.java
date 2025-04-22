//백준 1157번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] alpha = new int[26];
        s = s.toUpperCase();


        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i)-'A';
             alpha[index]++;
        }

        int max=-1;
        char result = '?';

        for (int i=0; i<26; i++) {
            if(alpha[i]>max) {
                max = alpha[i];
                result = (char)(i +'A');
            } else if (alpha[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
