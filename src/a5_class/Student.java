package a5_class;
//정보를 다룰때는 main 사용 x
//이 자료형의 목적은 학생데이터를 저장하기 위함
// 이런 목적의 클래스에는 main()를 선언하지 않는다.
public class Student {
//    내부구성요소(필드, 생성자, 메서드)
//    1. 필드
    String name;
    int age;
    String address;
    String gender;
    double scoreMath;
    double scoreHistory;
    double scoreMusic;

//    2. 생성자 : 필드영역을 초기화하는 역할. new뒤에 사용
//    2-1 기본생성자
    public Student() {}
//    2-2 매개변수가 있는 생성자
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address, String gender, double scoreMath, double scoreHistory, double scoreMusic) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.scoreMath = scoreMath;
        this.scoreHistory = scoreHistory;
        this.scoreMusic = scoreMusic;
    }

    //    생성자와 메서드의 차이점
//    목적1: 생성자는 필드의 초기화 역할, 메서드는 기능 구현역할
//    목적2 : 생성자는 클래스와 동일, 메서드는 동사로 시작하도록 작명(동사+명사)
//    목적3 : 반환형 < 생성자는 반환형 없음, 메서드는 반드시 명시(void, int, String 등)

    //    3. 메서드

    @Override // 부모의 메서드를 자식이 수정했다는 의미. 자식만 가지고 있는 메서드에는 안붙음.
    public String toString() {
        // return super.toString(); // super = 해당 클래스의 상위 클래스 호출(부모 클래스인 Object 클래스)
        String all = this.name + this.age + " " +averageScore();
        return all; // 반환하는 값은 이 클래스에 맞춰 작성해야함.
    }

    public double sumScore(){
        double sum = this.scoreMath + this.scoreHistory + this.scoreMusic;
        return sum;
    }
    public double averageScore(){
        double sum = sumScore(); // 메서드에는 this를 생략함.
        double average = sum / 3;
        return average;
    }
    public String setName(String newName){
        /*중요!
        * 클래스의 필드를 직접 수정하면 각 필드의 특징을 거스르는 값이 저장될 수 있음
        * 예를 들어 숫자가 포함된 이름과 같이 문법적으로는 문제가 없으나 이름에는 적절하지 못함
        * 그러므로 필드에 직접수정하는 방식을 막고 메서드를 통한 수정방식을 선호함
        * ==> 이것을 클래스의 은닉화(=Capsulization) 이라고 함.*/
        //        if (문자열안에 숫자가 포함되어 있다면){
//            System.out.println("에러발생. 이름안에 숫자가 있습니다.");
//            // 예외발생~
//        } else if(빈 문자열이라면{
//            System.out.println("에러발생. 이름이 없음.");
//            // 예외발생~
//        }
        this.name = newName;
        return  this.name;


    }
}
