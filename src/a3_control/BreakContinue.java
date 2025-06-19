package a3_control;

public class BreakContinue {
    public static void main(String[] args) {
//        제어키워드
//        break;
//        switch, for, while, do while의 중괄호를 탈출하는 용도로 사용함 (if 제외)
//        *중요* : 가장 가까운 중괄호 하나만 탈출 가능
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            break;
        }

//        기본형
        for(int i =0; i<10; i++){
            if(i == 5){
                break; // 해당하는 값에 도달하였을때 출력을 중단. < 해당하는 값 까지만 출력
            }
            System.out.print(i +" ");
            System.out.println();
        }
//        이중 for문
        for(int i = 0; i<8; i++){
            for(int j = 0; j<5; j++){
                if(j==2){
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); //i=?, j=?
            }
        }
        System.out.println();
//        이중 for문을 한번에 탈출하는 코드 tip임

        for(int i = 0; i<3; i++){
            for(int j = 0; j<5; j++){
                if(j==2){
                    i=9999;
                     // 바깥의 반복자를 강제로 false가 되는 값으로 입력하면 종료됨.
//                    쓰는 이유는 이중 for문을 한번에 끝내기 위해서? 숫자를 크게 쓰는 이유는 잘 보이기 위해서.
                    break;
                }
                System.out.println("i=" + i + ", j=" + j); //i=?, j=?
            }
        }
        System.out.println();
//      continue
//      반복문 안에서 현재 반복을 건너뛰고 다음 반복으로 넘어가도록 함
//      핵심은 continue가 선언된 위치의 아래쪽 코드를 실행하지 않는 것
        for(int i=0; i<10; i++){
            if(i == 5){
                continue; // 해당하는 조건을 거르고 나머지 출력
            }
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
