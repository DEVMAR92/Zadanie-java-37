public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Imię: " + firstName + ", Nazwisko: " + lastName + ", Wiek: " + age + ", Pesel: " + pesel;
    }
}
