import java.time.LocalDate;
import java.time.Period;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    //calculate age of worker
    protected int getAge() {
        LocalDate dob = LocalDate.parse(birthDate);
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(dob, curDate);
        int age = period.getYears();
        return age;
    }

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    protected double collectPay() {
        return 0.0;
    }

    protected void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
