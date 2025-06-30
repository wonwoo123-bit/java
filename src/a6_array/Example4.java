package a6_array;

public class Example4 {
    public static void main(String[] args) {
        // 배열내의 최대값을 리턴하는 메서드
        int[] numbers1 = {42, 17, 88, 5, 63, 29, 76, 34, 51, 10};
        int[] numbers2 = {12, 45, 67, 3, 99, 21, 58, 74, 86, 31};
        System.out.println(getMax(numbers1)); // 88
        System.out.println(getMax(numbers2)); // 99
    }
    public static int getMax(int[] numbers) {
//        int max = numbers[0];
//        for (int data : numbers){
//            if (data>max){
//                max = data;
//            }
//        }
//        return max;
//    }
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }

        }return max;
    }
}
