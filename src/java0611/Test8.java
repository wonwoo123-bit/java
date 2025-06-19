package java0611;

import javax.swing.plaf.IconUIResource;

public class Test8 {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            for(int j=0; j<5; j++){
                if (i == 3 && j == 3) {
                    i = 222;
                    break;
                }
                System.out.println(" " + i + " " + j);
            }
        }
        System.out.println();
//
        out:
        for(int i =0; i<10; i++){
            for(int j=0; j<5; j++){
                if (i == 3 && j == 3) {
                    break out;
                }
                System.out.println(" " + i + " " + j);
            }
        }

    }
}
