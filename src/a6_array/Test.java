package a6_array;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        int[] data1 = new int[] {1, 2, 3};
        int[] data2 = {1, 2, 3};
        System.out.println(a.arraySum(data1));
        System.out.println(a.arraySum(data2));
        System.out.println(a.arraySum(new int[] {1, 2, 3}));
//        System.out.println(a.arraySum({1, 2, 3}));
    }
}
class A {
    int arraySum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}