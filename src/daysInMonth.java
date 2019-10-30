public class daysInMonth {
    public static void main(String[] args) {
        int monthNum = 12;
        int numDays = 0;
        int year = 2019;

        switch (monthNum) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (year%4 == 0) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
        }
        System.out.println(numDays);
    }
}
