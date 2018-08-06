public class Test {
    public static void main(String[] args) {

        Person[] persons = new Person[2];
        PersonReader reader = new PersonReader();

        try {
            for (int i = 0; i < persons.length; i++) {
                persons[i] = reader.readAndCreate();
            }
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
            e.fillInStackTrace();
        } finally {
            reader.close();

        }

        for (int i = 0; i < persons.length; i++) {
            String show = persons[i].toString();
            System.out.println(show);
        }
    }
}
