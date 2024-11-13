import java.util.Scanner;

public class SpoonerismGenerator {

       public static String getWord(String wordNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + wordNumber + " word: ");
        return scanner.nextLine().toLowerCase();
    }
    
    public static int vowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;     }
        
    public static void run() {
        String word1 = getWord("first");
        String word2 = getWord("second");

        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

               if (index1 <= 0 || index2 <= 0) { 
            System.out.println(word1 + " and " + word2 + " are not suitable for a Spoonerism.");
        } else {
           
            String prefix1 = word1.substring(0, index1);
            String prefix2 = word2.substring(0, index2);
            String suffix1 = word1.substring(index1);
            String suffix2 = word2.substring(index2);

       
            String spoonerizedWord1 = prefix2 + suffix1;
            String spoonerizedWord2 = prefix1 + suffix2;

            
            System.out.println("Original words: " + word1 + " and " + word2);
            System.out.println("Spoonerized words: " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }

    public static void main(String[] args) {
        run();
    }
}
