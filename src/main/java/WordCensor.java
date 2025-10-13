import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        String sentence, censored_dang, censored_nuts, censored_oops, censoredFull;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter a sentence: ");
        sentence = sc.nextLine();
        censored_dang = sentence.replace("dang", "***");
        censored_nuts = censored_dang.replace("nuts", "***");
        censored_oops = censored_nuts.replace("oops", "***");
        censoredFull = censored_oops.replace("yikes", "***");
        System.out.print("Censored: " + censoredFull);
    }
}
