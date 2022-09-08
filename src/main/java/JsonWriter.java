import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;


public class JsonWriter {
    public static String writeToJson(List<User> users) {
        StringBuilder stringBuilder = new StringBuilder();

        try (PrintWriter writer = new PrintWriter(new FileWriter("target/user.json"))) {
            Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
            writer.write(gson.toJson(users));
            stringBuilder.append(gson.toJson(users));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}
