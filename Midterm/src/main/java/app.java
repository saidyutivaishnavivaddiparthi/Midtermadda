public class app {
    public static String validatePerson(String name, int id) {
        if ("ram".equals(name) && id == 3025) {
            return "Valid Person";
        } else {
            return "Invalid Person";
        }
    }
}
