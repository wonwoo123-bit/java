package jdbc;

import a8_modifier.Modifier1.pack2.D;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class JdbcExample1 {
    //    #1 데이터베이스 연결 정보
    private static final String URL = "jdbc:mariadb://localhost:3306/testdb";
    private static final String User = "root";
    private static final String PASSWORD = "1234";

    //    #2 정보를 조회하는 메서드 정의
//    고객번호로 고객 정보 조회
    public Customer getCustomer(String customerId) {
        Customer customer = null;
        String query = "select * from 고객 where 고객번호 = ?";
        try (
                Connection connection = DriverManager.getConnection(URL, User, PASSWORD);
                PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, customerId);
            try (ResultSet resultSet = ps.executeQuery()) {
//                    O - R 매핑
                if (resultSet.next()){
                    customer = new Customer();
                    customer.setCustomerId(resultSet.getString("고객번호"));
                    customer.setCompanyName(resultSet.getString("고객회사명"));
                    customer.setContactName(resultSet.getString("담당자명"));
                    customer.setContactTitle(resultSet.getString("담당자직위"));
                    customer.setAddress(resultSet.getString("주소"));
                    customer.setCity(resultSet.getString("도시"));
                    customer.setRegion(resultSet.getString("지역"));
                    customer.setPhone(resultSet.getString("전화번호"));
                    customer.setMileage(resultSet.getInt("마일리지"));
                }
            }
        } catch (SQLException e) {
            System.out.println("에러발생");

        }
        return customer;
    }

//  모든 고객 정보를 조회
    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        String query = "select * from 고객";
        try (
            Connection connection = DriverManager.getConnection(URL, User, PASSWORD);
            PreparedStatement ps = connection.prepareStatement(query);
//            Statement statement = statement.createStatement();
            ResultSet resultSet = ps.executeQuery()){
            /*Statement vs PreparedStatement
            * Statement는 ?가 없는 고정된 SQL구문을 전송할 때 사용
            * PreparedStatement는 ?가 있는 동적인 SQL구문을 전송할 때 사용
            * 현업에서는 PreparedStatement를 사용하는 것이 권장됨
            * 해커의 SQl 삽입공격을 방지할 수 있음
            * */
            System.out.println("연결성공");
//                    O - R 매핑
            while (resultSet.next()){
                Customer customer = new Customer();
                customer.setCustomerId(resultSet.getString("고객번호"));
                customer.setCompanyName(resultSet.getString("고객회사명"));
                customer.setContactName(resultSet.getString("담당자명"));
                customer.setContactTitle(resultSet.getString("담당자직위"));
                customer.setAddress(resultSet.getString("주소"));
                customer.setCity(resultSet.getString("도시"));
                customer.setRegion(resultSet.getString("지역"));
                customer.setPhone(resultSet.getString("전화번호"));
                customer.setMileage(resultSet.getInt("마일리지"));

                customers.add(customer);
            }
        } catch (SQLException e) {
            System.out.println("에러발생");
        }return customers;
    }
//    모든 부서 정보를 조회
    public List<Department> getAllDepartments(){
        List<Department> departments = new ArrayList<>();
        String query = "select * from 부서";
        try (
                Connection connection = DriverManager.getConnection(URL, User, PASSWORD);
                PreparedStatement ps = connection.prepareStatement(query);
                ResultSet resultSet = ps.executeQuery()){
            while (resultSet.next()){
                Department department = new Department();
                department.setDepartmentId(resultSet.getString("부서번호"));
                department.setDepartmentName(resultSet.getString("부서명"));
                departments.add(department);
            }


        }catch (SQLException e){
            System.out.println("에러");
        }
        return departments;
    }

//    join 쿼리 - 아래 key를 가지는 직원 정보
//    이름, 입사일, 부서명
//    특정 클래스의 인스턴스에 담을 수 없음으로 Map<key,values> 형태로 만듬
    public List<Map<String, Object>> getEmployees(){
        List<Map<String, Object>> employees = new ArrayList<>();
        String query = "select 이름, 입사일, 부서명 from 사원"
                + " inner join 부서 on 사원.부서번호 = 부서.부서번호";
        try (
                Connection connection = DriverManager.getConnection(URL, User, PASSWORD);
                PreparedStatement ps = connection.prepareStatement(query);
                ResultSet resultSet = ps.executeQuery()){
            while (resultSet.next()){
                Map<String, Object> employee = new HashMap<>();
                employee.put("이름", resultSet.getString("이름"));
//                employee.put("입사일", resultSet.getString("입사일"));
//                문자열로 받아서 LocalDate로 변환
//                YYYY-MM-DD 형태여야 사용 가능한 방법임
                LocalDate date = LocalDate.parse(resultSet.getString("입사일"));
                employee.put("입사일", date);
                employee.put("부서명", resultSet.getString("부서명"));
                employees.add(employee);


            }


        }catch (SQLException e){
            System.out.println("에러");
        }
        return employees;
    }


    public static void main(String[] args) {
//        데이터베이스 연결
//        sql 쿼리를 전송해서 응답을 받음
//        응답받은 정보를 클래스에 매핑
        JdbcExample1 repository = new JdbcExample1();
        System.out.println("해당 고객 조회");
        Customer foundCustomer = repository.getCustomer("AIHTR");
        System.out.println(foundCustomer);
        System.out.println("전체 고객 조회");
        List<Customer> allCustomers = repository.getAllCustomers();
        System.out.println(allCustomers);
        System.out.println("전체 부서 조회");
        List<Department> allDepartments = repository.getAllDepartments();
        System.out.println(allDepartments);
        System.out.println();
        List<Map<String, Object>> employees = repository.getEmployees();
        System.out.println(employees);

    }
}