public class Conditions {
    public static void main(String[] args) {
        int numberGrade = 100;
        String letterGrade;

        if (numberGrade >= 90) {
            if (numberGrade == 100) {
                letterGrade = "A+";
            } else {
                letterGrade = "A";
            }
        } else if (numberGrade >= 80) {
            letterGrade = "B";
        } else if (numberGrade >= 70) {
            letterGrade = "C";
        } else if (numberGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.println("Grade = " + letterGrade);
    }
}
