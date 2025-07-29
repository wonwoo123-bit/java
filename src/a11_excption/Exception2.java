package a11_excption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
//        3. try with resources 문
//        java 7부터 사용가능
//        AutoCloseable  인터페이스를 구현한 클래스만 () 구문안에 사용 가능
//        AutoCloseable : 자동으로 리소스를 해제해주는 기능
        try(Scanner scanner = new Scanner(new File("test.text"))){
            String line = scanner.nextLine();
            System.out.println(line);
        }catch (FileNotFoundException e){
//            파일이 없어서 예외가 발생하는 경우라도
//            scanner 리소스는 자동으로 닫힘
            System.out.println("파일을 찾을 수 없습니다.");

        }

//      try with resources를 사용하지 않았을 경우(비교용)
        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(new File("test2.txt"));
        }catch (FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다");
        }finally {
            if (scanner2 != null){
                scanner2.close();
                System.out.println("finally 안에서 리소스를 해제함");
            }
        }

    }
}
