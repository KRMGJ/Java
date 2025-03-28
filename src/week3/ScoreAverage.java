package week3;

public class ScoreAverage {
    public static void main(String[] args) {
        // 2차원 배열에 학년별로 1, 2학기 성적으로 저장하고, 4년간 전체 평점 평균을 출력
        double[][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        double sum = 0;
        for (double[] doubles : score) { // 2차원 배열의 행을 하나씩 가져옴
            for (double aDouble : doubles) { // 2차원 배열의 열을 하나씩 가져옴
                sum += aDouble; // 평점을 더함
            }
        }
        int n = score.length * score[0].length; // 배열의 크기를 구함
        System.out.println("4년 전체 평점 평균은 " + sum / n);
    }
}
