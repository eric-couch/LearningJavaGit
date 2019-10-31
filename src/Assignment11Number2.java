public class Assignment11Number2 {
    public static void main(String[] args) {
        String DoW = "Mon";
        int numDoW;
        //Monday, Monday, mon, Mon
        //Tuesday, TUESDAY, tue, Tue

        String fixedDoW = DoW.toLowerCase().substring(0,3);

        switch (fixedDoW) {
            case "mon":
            numDoW = 1;
            break;
            case "tue":
            numDoW = 2;
            break;
        }
    }
}
