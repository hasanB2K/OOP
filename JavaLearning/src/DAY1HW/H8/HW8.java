package DAY1HW.H8;

public class HW8 {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("Given Char is an Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Given Char is a Digit");
        } else {
            System.out.println("Given Char is a Special Character");
        }
    }
}
