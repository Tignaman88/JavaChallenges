public class PrimarySchoolStudent extends TheObjectClass{
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;

    }

    @Override
    public String toString() {
        return parentName + "'s kid " + super.toString();
    }
}
