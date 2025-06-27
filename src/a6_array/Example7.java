package a6_array;

public class Example7 {
    public static void main(String[] args) {
        // 아래 2차원 배열의 모든 값의 합과 평균을 출력하는 메서드
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        calculate2DArray(arr); // total=325 average=16.25
    }
    public static void calculate2DArray(int[][] arr) {
        int total = 0;
        double average = 0;
        
        // 여기에 코드를 작성하여 2차원 배열의 합과 평균을 계산하고
        // total과 average에 각각 입력하여 아래 코드로 출력되게 하세요
        
        System.out.println("total="+total); // 325
        System.out.println("average="+average); // 16.25
    }
}
