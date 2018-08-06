import java.util.Scanner;

public class PersonReader {

    private Scanner scanner;

    PersonReader() {
        scanner = new Scanner(System.in);
    }

    public void close() {
        scanner.close();
    }


    public Person readAndCreate() throws NameUndefinedException, IncorrectAgeException {
        System.out.println("Imię:");
        String firstName = scanner.nextLine();
        if (firstName == null || firstName.length() <= 2) {
            throw new NameUndefinedException();
        }
        System.out.println("Nazwisko:");
        String lastName = scanner.nextLine();
        if (lastName == null || firstName.length() <= 2) {
            throw new NameUndefinedException();
        }
        System.out.println("Wiek:");
        int age = scanner.nextInt();
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        scanner.nextLine();
        System.out.println("Pesel:");
        String pesel = scanner.nextLine();

        return new Person(firstName, lastName, age, pesel);
    }
}
