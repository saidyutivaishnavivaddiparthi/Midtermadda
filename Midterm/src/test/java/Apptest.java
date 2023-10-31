import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Apptest {
    private static final Properties config = new Properties();

    static {
        try (InputStream input = Apptest.class.getResourceAsStream("/Config.properties")) {
            config.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String validatePerson(String name, int id) {
        String correctName = config.getProperty("Vaishnavi");
        int correctId = Integer.parseInt(config.getProperty("20MIC0014"));

        if (correctName.equals(name) && id == correctId) {
            return "Valid Person";
        } else {
            return "Invalid Person";
        }
    }
}
