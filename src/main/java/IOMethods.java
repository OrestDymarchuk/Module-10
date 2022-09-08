import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOMethods {

    /*
    Task 1. Method of reading data from a text file containing phone numbers
     */
    public static String readFromFileWithNumbers() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

    /*
    Task 2. Method of reading data from a text file containing user information
     */
    public static List<User> readFromFileUserData() {
        List<User> users = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("SecondTask.txt"));
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userNameAge = line.split(" ");
                users.add(new User(userNameAge[0], Integer.parseInt(userNameAge[1])));
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return users;
    }
    /*
    Task 3. Method of reading data from a text file containing words
     */
    public static String readFromFileWithWords(){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append(" ");
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}
