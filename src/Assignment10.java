public class Assignment10 {
    public static float shipping (float orderValue,
                           boolean saturdayDelivery,
                           String destination) {
        float deliveryCost;
        if ( destination.equals("US") ) {
            deliveryCost = 20.0f;
        } else if ( destination.equals("Mexico") ) {
            deliveryCost = 32.0f;
        } else {      // Assume that the country is Canada
            deliveryCost = 25.0f;
        }

        return deliveryCost;
    }

    public static void main(String[] args) {
        System.out.println(shipping(200.0f,true,"Canada"));
        System.out.println(shipping(100.0f,false,"Mexico"));
    }
}
