package a5_class;

public class MyClass {
    public static void main(String[] args) {
        // 학생클래스의 객체 생성
        Student steve = new Student("steve", 25);
        Student tom = new Student(); // 기본생성자
        Student sam = new Student("sam", 29, "대전", "남", 100, 90, 80);
        System.out.println(steve.name);
        System.out.println(tom.name); //null < 문자열에서 0을 뜻함
        System.out.println(sam.name);
//        객체 생성 이후 개별적으로 필드를 수정할 수 있음.
        tom.name = "Tom";
        tom.age = 21;

//        성적조회
        System.out.println(tom.name + " " + tom.age);
        double sumScoreSam = sam.sumScore(); // 메서드의 호출
        System.out.println(sumScoreSam);
        double averageScoreSam = sam.averageScore();
        System.out.println(averageScoreSam);
//        중요 Sam의 성적을 알고 싶으면 Sam의 정보를 담고있는 객체의 메서드를 호출 해야한다.


        Book harry = new Book("해리포터", "J.K.롤링", "14000원");
        System.out.println();
        String harryInfo = harry.printBookInfo();
        System.out.println(harryInfo);
    }
}
