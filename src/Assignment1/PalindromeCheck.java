package Assignment1;

class PalindromeCheck {

    boolean isPalindrome(String str) {
        String rev = "";

        for(int i=str.length()-1; i>=0; i--)
            rev += str.charAt(i);

        return str.equals(rev);
    }

    public static void main(String[] args) {
        PalindromeCheck obj = new PalindromeCheck();

        if(obj.isPalindrome("madam"))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
