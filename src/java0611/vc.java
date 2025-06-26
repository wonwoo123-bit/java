package java0611;

class cv {
    int m = 3;
    int n = 4;
    void work1(){
        int k = 5;
        System.out.println(k);
        work2(3);
    }
    void work2(int i){
        int j= 4;
        System.out.println(i + j);
    }
}

public class vc{
    public static void main(String[] args) {
        cv a = new cv();
        System.out.println(a.m);
        a.work1();
    }
}