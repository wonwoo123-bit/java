package java0611;

public class ㅅㄱ {
    public static void main(String[] args) {
        int score = 72;
        if (score >= 80 && score <90){
            System.out.println("B학점");}
        else if(score >= 90){
            System.out.println("A학점");}
        else if(score >= 70 && score < 80) {
            System.out.println("C학점");
        }
        else {
            System.out.println("F학점");
        }

        switch (score/10){
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");break;
            case 7:
                System.out.println("C학점");break;
            default:
                System.out.println("F학점");
        }

    }

}
