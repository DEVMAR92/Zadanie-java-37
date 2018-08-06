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
        System.out.println("Nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Wiek:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pesel:");
        String pesel = scanner.nextLine();
        return new Person(firstName, lastName, age, pesel);
    }
}
