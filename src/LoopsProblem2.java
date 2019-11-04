public class LoopsProblem2 {
    //problem 2
    // test a string to see if it is a palindrome
    // level, a man a plan a canal panama
    // go hang a salami I'm a lasagna hog
    public static void main(String[] args) {
        String pal = "level";
        boolean isPal = true;
        for (int i=0;i<pal.length();i++) {
            if (pal.toCharArray()[i] != pal.toCharArray()[pal.length()-(i+1)]) {
                isPal = false;
            }
        }
        System.out.print("The string is ");
        if (!isPal) {
            System.out.print("not ");
        }
        System.out.println("a palindrome.");
    }
}
