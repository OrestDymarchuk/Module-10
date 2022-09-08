import java.util.List;
import java.util.Map;

public class Tasks {

    public static void firstTask() {
        String numbers = IOMethods.readFromFileWithNumbers();
        String validNumbers = DataChanger.phoneNumberCheck(numbers);
        System.out.println(validNumbers);
    }

    public static void secondTask(){
        List<User> users = IOMethods.readFromFileUserData();
        String jsonFormat = JsonWriter.writeToJson(users);
        System.out.println(jsonFormat);
    }

    public static void thirdTask() {
        String words = IOMethods.readFromFileWithWords();
        Map<String, Integer> wordsMap = DataChanger.wordsFrequency(words);
        String sortedWords = DataChanger.wordsSorter(wordsMap);
        System.out.println(sortedWords);
    }
}
