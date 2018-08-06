public class IncorrectAgeException extends Exception {
    public IncorrectAgeException() {
        System.err.println("Wiek ujemny lub zerowy");
    }
}
