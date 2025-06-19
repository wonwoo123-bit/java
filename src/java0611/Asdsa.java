package java0611;

public class Asdsa {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j < 3; j++){
                if(i==2){
                    continue;
                }
                if(j==1){
                    break;
                }
                System.out.println("A");
            }
        }

        for(int i=0; ; i++){
            if(i>10){
                break;
            }
            if(i%2==1){
                continue;
            }
            System.out.print(i +",");
        }
    }
}
