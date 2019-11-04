import java.util.Scanner;7

public class LoopsProblem4 {
    static Scanner sc = new Scanner((System.in));
    public static void main(String[] args) {
        System.out.println("How tall do you want your Christmas tree: ");
        String response = sc.nextLine();
        int height = Integer.parseInt(response);

        for (int j = 0; j <= height; j++)
        {
            for (int i = 0; i < height - (j - 1); i++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < (j * 2) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
