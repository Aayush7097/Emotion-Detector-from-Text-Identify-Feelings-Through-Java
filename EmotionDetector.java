import java.util.HashMap;
import java.util.Scanner;

public class EmotionDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        HashMap<String, String> emotions = new HashMap<>();
        emotions.put("happy", "joy");
        emotions.put("sad", "sadness");
        emotions.put("angry", "anger");
        emotions.put("excited", "joy");
        emotions.put("tired", "neutral");

        System.out.println("Welcome to the Emotion Detector!");
        System.out.println("Type a sentence to analyze your emotions or type 'exit' to quit:");

        while (true) {
            input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            String detectedEmotion = detectEmotion(input, emotions);
            System.out.println("Detected Emotion: " + detectedEmotion);
        }

        scanner.close();
    }

    private static String detectEmotion(String text, HashMap<String, String> emotions) {
        String[] words = text.split("\\s+");
        HashMap<String, Integer> emotionCount = new HashMap<>();

        for (String word : words) {
            if (emotions.containsKey(word)) {
                String emotion = emotions.get(word);
                emotionCount.put(emotion, emotionCount.getOrDefault(emotion, 0) + 1);
            }
        }

        return getDominantEmotion(emotionCount);
    }

    private static String getDominantEmotion(HashMap<String, Integer> emotionCount) {
        String dominantEmotion = "neutral";
        int maxCount = 0;

        for (String emotion : emotionCount.keySet()) {
            if (emotionCount.get(emotion) > maxCount) {
                maxCount = emotionCount.get(emotion);
                dominantEmotion = emotion;
            }
        }

        return dominantEmotion;
    }
}
