public class Mentor extends Instructor {
    public Mentor(Long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public double period(Group group) {
        return super.period(group);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
