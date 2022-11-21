import java.util.Arrays;

public abstract class Person {
    private Long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(Long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract double period(Group group);

    public static void sortAge(Person[] people) {
        long[] arrayAge = new long[people.length];
        int index = 0;
        for (Person person : people) {
            arrayAge[index] = person.getAge();
            index++;
        }
        Arrays.sort(arrayAge);
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length; j++) {
                if (people[j].getAge() == arrayAge[i]) {
                    System.out.println(people[j].getFullName() + " " + people[j].getAge());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
