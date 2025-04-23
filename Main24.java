//백준 25206번

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;  // 평점 × 학점 누적합
        double totalCredit = 0.0; // P 제외한 학점 누적합

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" "); // 과목, 학점, 등급
            String subject = input[0];
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            if (grade.equals("P")) continue; // P는 계산 제외

            // 등급을 점수로 변환
            double score = getScore(grade);

            totalScore += credit * score;
            totalCredit += credit;
        }

        System.out.printf("%.6f", totalScore / totalCredit);
    }

    public static double getScore(String grade) {
       switch (grade) {
            case "A+" : return 4.5;
            case "A0" : return 4.0;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            case "F"  : return 0.0;
            default : return 0.0;
        }
    }
}
