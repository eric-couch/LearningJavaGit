
public class LoopsProblem3 {
    public static int[] generateArray() {
        int[] arr = new int[100];

        for (int i = 0; i<100; i++) {
            arr[i] = i+1;
        }

        //int random = (int)(Math.random()*100)+1;
        int remove = (int)(Math.random()*100)+1;
        int replicate = (int)(Math.random()*100)+1;
        while (replicate == remove)
        {
            replicate = (int)(Math.random()*100)+1;
        }

        arr[remove-1] = arr[replicate-1];

        for (int i = arr.length; i > 0; i--)
        {
            int j = (int)(Math.random()*i)+1;
            int k = arr[j];
            arr[j] = arr[i - 1];
            arr[i - 1] = k;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arrOfInts = generateArray();
        for (int i=0;i<arrOfInts.length;i++) {
            System.out.println(arrOfInts[i]);
        }
    }
}
