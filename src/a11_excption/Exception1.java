package a11_excption;

public class Exception1 {
    public static void main(String[] args) {
//        try catch 문
//        RuntimeException < 산술예외의 부모 클래스
//        크키가 큰것이 앞에 있다면 뒤에것은 에러 발생으로 사용 불가능 크기가 큰 순서부터 사용하면 가능
//        catch 여러가지 사용 가능
        try{
            //System.out.println(3/0); // 0으로 나누면 산술예외 발생
            int[] arr = new int[]{1,2,3};
            arr[3] = 0; // 배열초과 예외 발생
        }catch (ArithmeticException e){
            System.out.println("산술예외가 발생하여 종료됨");
        }catch (RuntimeException e){
            System.out.println("런타임 예외 발생");
        }


//        try catch finally 문
        try{
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println("산술예외");
        }finally {
//            예외상황이건 아니건 모두 실행됨
//            자원(=리소스)의 회수를 위하여 사용함
//            메모리할당이 발생했다면 여기서 메모리 삭제
            System.out.println("프로그램 종료");
            System.out.println("주로 여기서 관련 리소스를 해제(메모리 삭제)");
        }
    }
}
