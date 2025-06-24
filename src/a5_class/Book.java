package a5_class;

public class Book {
    String title;
    String author;
    String price;

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String printBookInfo(){
        String info = this.title + " by " + this.author+", " + this.price;
        return info; // 변수를 안만들고 그냥 return 해서 바로 사용해도 됨.
    }

//    메서드 오버로딩이란?
//    메서드의 이름을 동일하게 유지하면서 메서드 시그니처를 다르게하여
//    여러 다른 기능을 메서드가 수행하도록 하는 기법
//    메서드 시그니처 = 메서드이름, 매개변수 자료형, 매개변수의 갯수

    public void method1(int a, String b){

    }
    public void method1(String c, int d){
        // 메서드 이름이 같지만 매개변수의 자료형이 다름으로 서로 다른 메서드로 인식함.
    }
    public void method1(int a, String b, boolean c){
//        메서드의 이름이 같지만 매개변수의 갯수가 다르므로 거로 다른 메서드로 인식
    }

//    메서드 오버로딩의 사용 이유
//    동일한 이름과 기능을 가진 메서드가 여러가지 형태의 매개변수를 사용가능하게 만들어서
//    메서드의 사용성을 높임. 개발자는 하나의 메서드 이름만 기억하고
//    여러가지 방법으로 사용할 수 있음.
//    ex: println 메서드
}
