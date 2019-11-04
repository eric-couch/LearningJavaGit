import java.util.Scanner;

public class LoopsProblem2AdvancedSolution {
    static Scanner sc = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println("Enter potential palindrome: ");
        String response = sc.nextLine();
        String pal = response.toLowerCase().replace(" ", "");
        boolean isPal = true;
        for (int i=0;i<pal.length();i++) {
            if (pal.toCharArray()[i] != pal.toCharArray()[pal.length()-(i+1)]) {
                isPal = false;
            }
        }
        System.out.println("The word is " + (isPal ? "" : "not ") + "a palindrome.");
    }

}
