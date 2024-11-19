public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }


    @Override
    protected double collectPay() {
        if(isRetired) {
            return annualSalary;
        } else {
            return annualSalary / 12;
        }
    }

    protected void retire() {
        isRetired = true;
    }
}
