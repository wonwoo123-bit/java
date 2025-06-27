package a6_array;

import java.util.Arrays;

public class Matrix2 {
    public static void main(String[] args) {
//        가변길이 2차원 배열
//        비정방행렬 배열
//        리터럴방식으로 생성
        int[][] array1 = {{1,2},{3,4,5}};
//        new 키워드로 생성
        int[][] array2 = new int[2][]; // 두번째 길이는 가변이므로 비워둔다.
//        array2[0][0] = 1; 에러남. 자식배열이 아직 생성되지 않았기 때문.
        array2[0] = new int[2];
        array2[1] = new int[3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;
        array2[1][2] = 5;
        System.out.println(Arrays.deepToString(array2));

    }
}
