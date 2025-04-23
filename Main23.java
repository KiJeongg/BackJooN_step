//백준 1316번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<n; i++) {
            String s = br.readLine();

            boolean isGroup = true;
            boolean[] overlap = new boolean[26];
            char prev = ' ';

            for(int j=0; j<s.length(); j++) {
                char now = s.charAt(j);

                if(now != prev) {
                    if (overlap[now-'a']) {
                        isGroup = false;
                        break;
                    }
                    overlap[now-'a'] = true;
                }
                prev = now;
            }
            if (isGroup) count++;

        }
        System.out.println(count);
    }
}
