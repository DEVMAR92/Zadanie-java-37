public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel)
            throws NameUndefinedException, IncorrectAgeException {
        this.firstName = firstName;
        if (firstName == null || firstName.length() <= 2) {
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
        if (lastName == null || lastName.length() <= 2) {
            throw new NameUndefinedException();
        }
        this.age = age;
        if (age < 1) {
            throw new IncorrectAgeException();
        }
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
