package a4_method;

public class Method0 {
//    public static void main(String[] args) {
//        // 그룹 1: 1반 학생들의 점수
//        int[] group1Scores = {88, 92, 75, 100, 95};
//
//        // --- 1반 최고 점수 찾기 (반복 로직 1) ---
//        int maxScore1 = 0;
//        for (int score : group1Scores) {
//            if (score > maxScore1) {
//                maxScore1 = score;
//            }
//        }
//        System.out.println("1반의 최고 점수: " + maxScore1);
//
//
//        // 그룹 2: 2반 학생들의 점수
//        int[] group2Scores = {70, 85, 88, 91, 82};
//
//        // --- 2반 최고 점수 찾기 (반복 로직 2) ---
//        int maxScore2 = 0;
//        for (int score : group2Scores) {
//            if (score > maxScore2) {
//                maxScore2 = score;
//            }
//        }
//        System.out.println("2반의 최고 점수: " + maxScore2);
//
//
//        // 그룹 3: 3반 학생들의 점수
//        int[] group3Scores = {99, 98, 97, 100, 96};
//
//        // --- 3반 최고 점수 찾기 (반복 로직 3) ---
//        int maxScore3 = 0;
//        for (int score : group3Scores) {
//            if (score > maxScore3) {
//                maxScore3 = score;
//            }
//        }
//        System.out.println("3반의 최고 점수: " + maxScore3);
//    }

    /**
     * 정수 배열(scores)을 입력받아 가장 높은 점수를 찾아 반환하는 함수
     * @param scores 점수들이 담긴 배열
     * @return 배열 안의 가장 큰 값
     */
    public static int findMaxScore(int[] scores) {
        int maxScore = 0;
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
        // 그룹 1: 1반 학생들의 점수
        int[] group1Scores = {88, 92, 75, 100, 95};
        int max1 = findMaxScore(group1Scores); // 함수 호출
        System.out.println("1반의 최고 점수: " + max1);

        // 그룹 2: 2반 학생들의 점수
        int[] group2Scores = {70, 85, 88, 91, 82};
        int max2 = findMaxScore(group2Scores); // 함수 재사용
        System.out.println("2반의 최고 점수: " + max2);

        // 그룹 3: 3반 학생들의 점수
        int[] group3Scores = {99, 98, 97, 100, 96};
        int max3 = findMaxScore(group3Scores); // 함수 재사용
        System.out.println("3반의 최고 점수: " + max3);
    }
}
