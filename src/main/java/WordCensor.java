import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        String sentence, censored;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter a sentence: ");
        sentence = sc.nextLine();
        censored = sentence.replace("dang", "***").replace("nuts", "***").replace("oops", "***").replace("yikes", "***");
        System.out.println ("Censored: " + censored);
    }
}
