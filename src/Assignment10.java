public class Assignment10 {
    public static float shipping (float orderValue,
                           boolean saturdayDelivery,
                           String destination) {
        float deliveryCost;
        if ( destination.equals("US") ) {
            deliveryCost = 20.0f;
            if (orderValue > 100.00f) {
                deliveryCost -= 5.00f;
            }
            if (saturdayDelivery) {
                deliveryCost += 10.00f;
            }
        } else if ( destination.equals("Mexico") ) {
            deliveryCost = 32.0f;
            if (orderValue > 100.00f) {
                deliveryCost -= 7.00f;
            }
            if (saturdayDelivery) {
                deliveryCost += 20.00f;
            }
        } else {      // Assume that the country is Canada
            deliveryCost = 25.0f;
            if (orderValue > 100.00f) {
                deliveryCost -= 7.00f;
            }
            if (saturdayDelivery) {
                deliveryCost += 12.00f;
            }
        }

        return deliveryCost;
    }

    public static void main(String[] args) {
        System.out.println(shipping(200.0f,true,"Canada"));
        System.out.println(shipping(100.0f,false,"Mexico"));
        System.out.println(shipping(50.0f,true,"US"));
        System.out.println(shipping(600.0f,false,"US"));
        System.out.println(shipping(100.0f,false,"Canada"));
    }
}
