package quizGame;

import java.util.*;
import okhttp3.*;
import org.json.*;

public class QuizGame {
    private static final String API_KEY = "YOUR_OPENAI_API_KEY";  // Replace with your key
    private static final String ENDPOINT = "https://api.openai.com/v1/chat/completions";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nSelect a topic:");
        System.out.println("1. Java Basics");
        System.out.println("2. OOP (Object-Oriented Programming)");
        System.out.println("3. Data Structures and Algorithms");
        System.out.println("4. Dynamic Programming");
        System.out.print("Enter your choice (number or name): ");
        
        String input = sc.nextLine().trim();
        int choice;

        if (input.equals("1") || input.equalsIgnoreCase("Java Basics")) {
            choice = 1;
        } else if (input.equals("2") || input.equalsIgnoreCase("OOP") || input.equalsIgnoreCase("Object-Oriented Programming")) {
            choice = 2;
        } else if (input.equals("3") || input.equalsIgnoreCase("Data Structures and Algorithms") || input.equalsIgnoreCase("DSA")) {
            choice = 3;
        } else if (input.equals("4") || input.equalsIgnoreCase("Dynamic Programming") || input.equalsIgnoreCase("DP")) {
            choice = 4;
        } else {
            System.out.println("Invalid input! Defaulting to Java Basics.");
            choice = 1;
        }

        System.out.print("How many questions do you want? ");
        int numQuestions = sc.nextInt();
        sc.nextLine(); // Clear buffer

        String topic = switch (choice) {
            case 1 -> "Java Basics";
            case 2 -> "Object-Oriented Programming";
            case 3 -> "Data Structures and Algorithms";
            case 4 -> "Dynamic Programming";
            default -> "Java Basics";
        };

        String prompt = "Generate " + numQuestions +
                " multiple-choice questions on " + topic +
                ". Return the result in JSON format like:\n" +
                "[{\"question\":\"...\",\"options\":[\"...\",\"...\",\"...\",\"...\"],\"answer\":0}]";

        System.out.println("\nGenerating questions from AI for topic: " + topic + "...");
        String aiResponse = callOpenAI(prompt);

        JSONArray questionsArray = new JSONArray(aiResponse);
        int score = 0;

        for (int i = 0; i < questionsArray.length(); i++) {
            JSONObject qObj = questionsArray.getJSONObject(i);
            String question = qObj.getString("question");
            JSONArray options = qObj.getJSONArray("options");
            int correctAnswer = qObj.getInt("answer");

            System.out.println("\nQ" + (i + 1) + ". " + question);
            for (int j = 0; j < options.length(); j++) {
                System.out.println((j + 1) + ". " + options.getString(j));
            }

            System.out.print("Your answer (1-4): ");
            int userAnswer = sc.nextInt() - 1;

            if (userAnswer == correctAnswer) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + (correctAnswer + 1));
            }
        }

        System.out.println("\n🎯 Quiz Over! " + name + ", your score: " + score + "/" + questionsArray.length());
    }

    private static String callOpenAI(String prompt) throws Exception {
        OkHttpClient client = new OkHttpClient();

        JSONObject json = new JSONObject();
        json.put("model", "gpt-4");
        JSONArray messages = new JSONArray();
        JSONObject msg = new JSONObject();
        msg.put("role", "user");
        msg.put("content", prompt);
        messages.put(msg);
        json.put("messages", messages);

        RequestBody body = RequestBody.create(json.toString(), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .url(ENDPOINT)
                .addHeader("Authorization", "Bearer " + API_KEY)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String responseBody = response.body().string();

            JSONObject jsonResponse = new JSONObject(responseBody);
            String content = jsonResponse
                    .getJSONArray("choices")
                    .getJSONObject(0)
                    .getJSONObject("message")
                    .getString("content");

            return content.replace("json", "").replace("", "").trim();
        }
    }
}