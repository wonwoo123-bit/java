package jdbc;

public class MileGrade {
    private String grade;
    private int upperMile;
    private int lowerMile;

    public MileGrade() {
    }

    public MileGrade(String grade, int upperMile, int lowerMile) {
        this.grade = grade;
        this.upperMile = upperMile;
        this.lowerMile = lowerMile;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getUpperMile() {
        return upperMile;
    }

    public void setUpperMile(int upperMile) {
        this.upperMile = upperMile;
    }

    public int getLowerMile() {
        return lowerMile;
    }

    public void setLowerMile(int lowerMile) {
        this.lowerMile = lowerMile;
    }

    @Override
    public String toString() {
        return "MileGrade{" +
                "grade='" + grade + '\'' +
                ", upperMile=" + upperMile +
                ", lowerMile=" + lowerMile +
                '}';
    }
}
