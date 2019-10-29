public class SwtichItUp {
    public static void main(String[] args) {
        int monthNum = 9;
        String monthStr = " ";

        if (monthNum == 1) {
            monthStr = "January";
        } else if (monthNum == 2) {
            monthStr = "February";
        } else if (monthNum == 3) {
            monthStr = "March";
        } else if (monthNum == 4) {
            monthStr = "April";
        } else if (monthNum == 5) {
            monthStr = "May";
        } else if (monthNum == 6) {
            monthStr = "June";
        } else if (monthNum == 7) {
            monthStr = "July";
        } else if (monthNum == 8) {
            monthStr = "August";
        } else if (monthNum == 9) {
            monthStr = "September";
        } else if (monthNum == 10) {
            monthStr = "October";
        } else if (monthNum == 11) {
            monthStr = "November";
        } else {
            monthStr = "December";
        }
        System.out.println(monthStr);
    }
}
