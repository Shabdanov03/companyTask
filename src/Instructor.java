import java.time.Period;

public class Instructor extends Person {
    private double salary;


    public Instructor(Long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double period(Group group) {
        int period= Period.between(group.getDateOfStart(),group.getDateOfFinish()).getMonths();
        return period*getSalary();//Жалпы окутуу убактысына Instructor ,
//Mentor канча зарплата алат,Student канча контракт толоосун ошону кайтарсын
    }

    @Override
    public String toString() {
        return super.toString()+
                "salary=" + salary;
    }
}
