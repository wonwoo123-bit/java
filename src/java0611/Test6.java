package java0611;

public class Test6 {
    public static void main(String[] args) {
        int a = 4, b = 5, c = 6;
        System.out.println(false && a-- > 6);
        System.out.println(true | b++ > 6);
        System.out.println(true ^ c++ >6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
