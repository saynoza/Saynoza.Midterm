package string.problems;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        String word1 = "Army";
        String word2 = "Mary";
        if (word1.length() == word2.length()) {
            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);
            if(result) {
                System.out.println(word1 + " and " + word2 + " are anagram.");
            }
            else {
                System.out.println(word1 + " and " + word2 + " are not anagram.");
            }
        }
        else {
            System.out.println(word1 + " and " + word2 + " are not anagram.");
        }
        //Write a Java Program to check if the two String are Anagram. Two String are called
        //Anagram when there is same character but in different order.For example,"CAT" and "ACT",
        // "ARMY" and "MARY".
    }
}
