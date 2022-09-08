import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataChanger {

    /*
    Task 1. Method to check for valid phone numbers
     */
    public static String phoneNumberCheck(String numbers) {
        String validRegex = "(\\d{3}-\\d{3}-\\d{4})|(\\(\\d{3}\\)\\s\\d{3}-\\d{4})";
        Matcher matcher = Pattern.compile(validRegex).matcher(numbers);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            builder.append(matcher.group()).append("\n");
        }
        return builder.toString();
    }

    /*
    Task 3.1. Method for counting words
     */
    public static Map<String, Integer> wordsFrequency(String words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] wordsArray = words.split(" ");

        for (String word : wordsArray) {
            wordsMap.merge(word, 1, Integer::sum);
        }
        return wordsMap;
    }

    /*
    Task 3.2. Method of sorting words by their frequency in reverse order
     */
    public static String wordsSorter(Map<String, Integer> wordsMap){
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordsMap.entrySet());
        entries.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : entries){
            stringBuilder.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        return stringBuilder.toString();
    }
}
