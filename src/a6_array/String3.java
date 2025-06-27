package a6_array;

import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
//        5.문자열 수정
//        대소문자 변경
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // < 소문자로 변환
        System.out.println(str1.toUpperCase()); // < 대문자로 변환
//        문자열 교체 replace
        System.out.println(str1.replace("Study","공부")); // (바꾸려는 문자, 바꿀 문자)
//        substring 중요!
        System.out.println(str1.substring(0,4)); // (앞자리 이상,뒷자리 미만)
        String text = "2024-10-28";
        String year = text.substring(0,4);
        String month = text.substring(5,7);
        String day  = text.substring(8); // 두번째 매개변수가 없다면 해당매개변수부터 끝까지 포함
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        String filename = "document.pdf";
        String extention = filename.substring(filename.indexOf('.')+1);
        System.out.println(extention);
//        split
//        예제설명 : sample 안의 / - 을 기준으로 나눠서 배열에 담는 방법
//        [abc, def,ghi,jkl]
        String sample = "abc/def-ghi jkl";
        String[] strArray = sample.split(" |-|/");
        System.out.println(Arrays.toString(strArray));
//        정규표현식 (regex = regular expression)
//        특정패턴을 가진 문자열을 찾거나 조작하기 위한 문자열
//        주로 문자열 검색, 추출, 치환과 같은 작업에 사용됨.
//        정규표현식을 통해 패턴을 효율적으로 찾고 원하는 부분을 추출 변경 가능함.


        // 이메일주소를 검증하는 정규표현식
        // ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$
        String email1 = "text@example.com";
        boolean isValid = email1.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
        System.out.println(isValid); // true
        String email2 = "textsdfkjdsak";
        isValid = email2.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
        System.out.println(isValid); // false

        // 한국휴대폰 유효성검사
        // ^01([0|1|6|7|8|9])-\\d{3,4}-\\d{4}$
        // 숫자로만 이루어진 문자열 검사
        // ^\\d+$
        // 알파벳 대소문자 및 숫자로만 이루어진 ID (6~12자리)
        // ^[a-zA-Z0-9]{6,12}$
        // 날짜 형식 검사 (YYYY-MM-DD)
        // ^\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$

        // <중요> 유저로부터 위와 같은 정보를 입력받을 때 유효성 검사가 필요함
        // 이때 if~else로 코드를 구현하면 지나치게 복잡하므로
        // 간단하게 정규표현식을 이용하자!!!!
        // 정규표현식은 https://regexr.com/에서 생성 가능 (또는 GPT 이용)
        System.out.println();


//        trim 공백제거 (단어의 앞뒤에 있는 공백)(단어의 안에는 제거x)
        String msg = "   abc   ";
        System.out.println(msg.trim());


        System.out.println();
//        6. 문자열의 내용 비교 *
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
