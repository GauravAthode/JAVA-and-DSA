package pack1;

public class Main {
    public static void main(String[] args) {
        String input = "Gaurav123@# CSE_2025!";
        
        // Remove everything except alphabets
        String onlyAlphabets = input.replaceAll("[^a-zA-Z]", "");

        System.out.println(onlyAlphabets); // Output: GauravCSE
    }
}
