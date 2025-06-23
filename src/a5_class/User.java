package a5_class;

public class User {
    //필드
    String username;
    String email;
    String password;


    //생성자 : 보통 기본생성자와 모든 필드를 매개변수로 하는 생성자를 선언해줌
    //만약 아무 생성자도 선언하지 않으면 자동으로 시본 생성자를 제공해준다.

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //메서드
    //패스워드를 변경하는 메서드
    public String setPassword(String newPassword) {
        this.password = newPassword;
        return this.password;
    }

}