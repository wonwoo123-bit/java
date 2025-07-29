package jdbc;

import java.time.LocalDate;

public class Employee {
    private String employeeId;
    private String name;
    private String englishName;
    private String spot;
    private String gender;
    private LocalDate birthday;
    private LocalDate hireDate;
    private String address;
    private String city;
    private String homeNumber;
    private String bossNum;
    private String departmentId;

    public Employee() {
    }

    public Employee(String employeeId, String name, String englishName, String spot, String gender, LocalDate birthday, LocalDate hireDate, String address, String city, String homeNumber, String bossNum, String departmentId) {
        this.employeeId = employeeId;
        this.name = name;
        this.englishName = englishName;
        this.spot = spot;
        this.gender = gender;
        this.birthday = birthday;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.homeNumber = homeNumber;
        this.bossNum = bossNum;
        this.departmentId = departmentId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getBossNum() {
        return bossNum;
    }

    public void setBossNum(String bossNum) {
        this.bossNum = bossNum;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", englishName='" + englishName + '\'' +
                ", spot='" + spot + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", hireDate=" + hireDate +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", bossNum='" + bossNum + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }
}
