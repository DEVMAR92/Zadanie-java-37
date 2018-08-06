public class NameUndefinedException extends Exception {
    public NameUndefinedException(){
        System.err.println("Imię za krótkie lub NULL");
    }
}
