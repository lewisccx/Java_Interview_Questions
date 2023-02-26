package basic;

public class PalindromeExample {

    static  boolean isPalindrome(String str){

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString().equals(str);
    }

    public static void main(String[] args) {
        int num = 4541;
        String numStr = String.valueOf(num);
        System.out.println(isPalindrome(numStr));
    }
}
