package Module3_String;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.PriorityQueue;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        String input = "successes";
        System.out.println("The given string is: " + input);
        
        char secondMostFrequentChar = findSecondMostFrequentChar(input);
        
        if (secondMostFrequentChar != '\0') {
            System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
        } else {
            System.out.println("There is no second most frequent character.");
        }
    }

    private static char findSecondMostFrequentChar(String str) {
        // Frequency map to count characters
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Use a priority queue to find the top two frequencies
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue() // Sort in descending order of frequency
        );

        pq.addAll(frequencyMap.entrySet());

        // Get the most frequent character
        pq.poll(); // Remove the most frequent character
        
        // Get the second most frequent character
        Map.Entry<Character, Integer> secondMostFrequent = pq.poll();
        
        return (secondMostFrequent != null) ? secondMostFrequent.getKey() : '\0';
    }
}

