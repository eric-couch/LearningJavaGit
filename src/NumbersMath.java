public class NumbersMath {
    public static void main(String[] args) {
        String fruits = "apple,orange,banana,grapes,grapefruit,lemon,pear,peach";

        String[] fruit = fruits.split(",");

        //System.out.println(fruit[3]);

        for (int x=0;x<fruit.length;x++) {
            System.out.println(fruit[x]);
        }

    }
}
