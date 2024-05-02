import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Direct sequence: ");
        String text = s.nextLine();

        boolean answer = checkIfPolindrome(text);
        System.out.print("Reverse sequence: " + answer);
    }

    public static boolean checkIfPolindrome(String s) {
        String reverse = "";
        boolean answer = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            answer = true;
        }
        return answer;
    }
}