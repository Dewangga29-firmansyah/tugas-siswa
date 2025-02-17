package StudentProject.src.tugasclass;

public class FullTime extends Teacher {
    private String unit;
    private int annualSalary;

    public FullTime(String name, int age, String subject, String unit, int annualSalary) {
        super(name, age, subject);
        this.unit = unit;
        this.annualSalary = annualSalary;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Unit: " + unit);
        System.out.println("Annual Salary: " + annualSalary);
    }
}
