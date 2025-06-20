package java0611;

public class 연습 {
    public static void main(String[] args) {
        // 0 ~ 13 어린이 // 14 ~ 19 청소년 // 20 ~ 성인
//        if문 연습
        int age = 16;
        if(0<=age && 13>=age){
            System.out.println("어린이");
        }
        else if(14<=age && 20>age){
            System.out.println("청소년");
        }
        else {
            System.out.println("성인");
        }
        int a;
        a = 0;
        do{
            System.out.println(a + " ");
            a++;
        }while (a < 0);

    }
}
