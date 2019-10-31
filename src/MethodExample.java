public class MethodExample {

    public static String eligibleForDraft(int age, char gender) {
        if (age >= 18) {
            if (gender == 'M') {
                return "Eligible for Draft";
            } else {
                return "Not eligible for Draft";
            }
        } else {
            return "Not eligible for Draft";
        }
    }

    public static void main(String[] args) {
        // 18 years old
        // have to male
        int ericsAge = 47;
        char ericsGender = 'M';

        System.out.println(eligibleForDraft(ericsAge, ericsGender));

        int freedasAge = 28;
        char freedasGender = 'F';

        System.out.println(eligibleForDraft(freedasAge, freedasGender));

    }
}
