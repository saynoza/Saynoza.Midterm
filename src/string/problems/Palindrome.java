package string.problems;

public class Palindrome {

    public static void main(String [] args){
        Palindrome pn = new Palindrome();

        if(pn.isPalindrome("MOM")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}

        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example,
          MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

