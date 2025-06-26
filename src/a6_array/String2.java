package a6_array;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
//        1. 문자열 길이 length()
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다!";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

//        2.문자열 검색 charAt(인덱스), indexOf(문자), lastIndexOf() <문자,숫자(인덱스 번호) 인덱스 번호부터 찾으라는 말임.>
        System.out.println(str1.charAt(1));
        System.out.println(str2.charAt(1));
        System.out.println();
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.indexOf('a',8));
        System.out.println(str1.lastIndexOf('a',8));
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.indexOf("java"));
        System.out.println();

//        3. 문자열의 변환 및 연결 valueOf(), concat()
        String str3 = String.valueOf(2.3); // double > String (Double.toString과 동일)
        String str4 = String.valueOf(false); // boolean > String (Boolean.toString과 동일)
        System.out.println();
        String str5 = str3.concat(str4);
        System.out.println(str5);
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3));
        System.out.println(str6);
        System.out.println(str7);

//        4. 문자열 -> byte[] 또는 char[]
//        문자열을 바이트의 배열로 만드는 이유는 네트워크 전송, 파일입출력 때문
//        예) Hello = 2byte*5 = 10byte, 바이트배열로 바꾸면 5바이트로 줄어듬
//        char 배열로 만드는 이유는 문자의 검색, 수정에 사용하기 위해서
        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
//        한글의 문자인코딩(character encoding) 방식
//        자바가 내부적으로 사용하는 방식은 UTF-16 (2byte)
//        윈도우 오피스가 사용하는 방식은 EUC-KR (2byte)
//        가장 널리 사용되는 글로벌 표준 방식은 UTF-8 (3byte)
//        한글은 최고 2byte가 필요함
//        array2의 byte[]이 15글자로 표현되는것으로 보아 UTF-8을 사용함.
        System.out.println();
//        문자의 배열이기 때문에 문자로 보여줌
//        바이트는 유니코드로 보여지기 때문에 숫자로만 나옴.
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
//        String은 불변성을 가지기 때문에 수정할 수 없음.
//        String을 char[]로 변경해서 수정하거나 검색하는데 용이하도록 사용.

    }
}
