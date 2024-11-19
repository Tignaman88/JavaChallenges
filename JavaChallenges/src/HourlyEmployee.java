public class HourlyEmployee extends Employee{
    private double hourlyPayRate;


    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    // employee pay rate for 40 hours
    @Override
    protected double collectPay() {
        return 40 * hourlyPayRate;
    }

    //double pay 
    protected double getDoublePay() {
        return 2 * collectPay();
    }
}
