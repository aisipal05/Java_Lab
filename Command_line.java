
public class Command_line {

    public static void main(String[] args) {
        // Join command-line arguments into one string
        String input = String.join(" ", args);

        // Split into words
        String[] words = input.split(" ");

        // Print in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
