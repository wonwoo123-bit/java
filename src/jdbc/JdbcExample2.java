package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample2 {
//    1. 데이터베이스 연결 정보
    private static final String URL = "jdbc:mariadb://localhost:3306/testdb";
    private static final String User = "root";
    private static final String PASSWORD = "1234";

//    2. INSERT
//    부서테이블 새로운 행 추가
    public void insertDepartment(String departmentNum, String departmentName){
        String query = "insert into 부서(부서번호, 부서명) values (? , ?)"; // ? < 플레이스홀더 (placeholder)라고 부름
        try (
                Connection connection = DriverManager.getConnection(URL, User, PASSWORD);
                PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1,departmentNum);
            ps.setString(2,departmentName);
            ps.executeUpdate(); // 쓰기동작은 executeUpdate 사용
            System.out.println("INSERT 성공");
        }catch (SQLException e){
            System.out.println("에러");
        }
    }

//    3. UPDATE
//    위에서 만든 해외영업무의 이름을 글로벌영어부로 변경
    public void updateDepartment(String newName, String oldName) {
        String query = "update 부서 set 부서명 = ? where 부서명 = ?";
        try (Connection connection = DriverManager.getConnection(URL, User, PASSWORD);
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setString(2, oldName);
            ps.executeUpdate();
            System.out.println("UPDATE 성공");
        } catch (SQLException e) {
            System.out.println("에러");
        }
    }
    public static void main(String[] args) {
        JdbcExample2 repository = new JdbcExample2();
//        repository.insertDepartment("A5","총무부");
//        repository.insertDepartment("A6","해외영업부");

        repository.updateDepartment("글로벌영업부", "해외영업부");
    }
}
