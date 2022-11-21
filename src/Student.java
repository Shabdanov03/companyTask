import java.time.Period;

public class Student extends Person {
    private double contract;

    public Student(Long id, String fullName, int age, char gender, double contract) {
        super(id, fullName, age, gender);
        this.contract = contract;
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public double period(Group group) {
        int period= Period.between(group.getDateOfStart(),group.getDateOfFinish()).getMonths();
        return period*getContract();//Жалпы окутуу убактысына Instructor ,
        // Mentor канча зарплата алат,Student канча контракт толоосун ошону кайтарсын
    }

    @Override
    public String toString() {
        return  super.toString()+
                "contract=" + contract;
    }
}
