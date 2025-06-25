package a6_array;

import a5_class.Student;

public class Array4 {
    public static void main(String[] args) {
//        반복문을 사용한 배열의 순회

//        배열의 길이
        int[] numbers = {3,4,5,6,7};
        System.out.println("배열의 길이=" + numbers.length); //.length 붙히면 배열의 길이를 알려줌

//        배열의 순회
//        방법 1
        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();

//        방법2 (배열과 컬렉션만 사용가능)
        for (int data : numbers){
            System.out.println(data);
        }

//        연습예제
        String[] colors = {"black", "white","blue","red","green"};
        for (String data : colors){
            System.out.println(data);
        }
        Student[] students = new Student[3];
        students[0] = new Student("steve",25,"대전", "남", 100,100,100);
        students[1] = new Student("tom", 21, "서울", "남", 90,80,70);
        students[2] = new Student("Laura",20,"부산","여",100,90,80);

        for (Student data : students){
            System.out.println(data);
        }


    }
}
