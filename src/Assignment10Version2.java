public class Assignment10Version2 {
    public static float shipping (float orderValue,
                                  boolean saturdayDelivery,
                                  String destination) {
        float deliveryCost;

        switch ( destination ) {
            case "US":
                deliveryCost = 20.0f;
                if (orderValue > 100) {
                    deliveryCost -= 5.00f;
                }
                break;
            case "Mexico":
                deliveryCost = 32.0f;
                if (orderValue > 100) {
                    deliveryCost -= 7.00f;
                }
                break;
            default:      // Assume that the country is Canada
                if (destination == "Canada") {  // check for canada, nothing else works
                    deliveryCost = 25.0f;
                } else {
                    deliveryCost = -1.0f;
                }
                break;

        }

        return deliveryCost;
    }

    public static void main(String[] args) {
        float shippingCost = 0.0f;
        shippingCost = shipping(200.0f,true,"Canada");
        if (shippingCost == -1.0f) {
            System.out.println("shipping outside of US, Mexico, or Canada not allowed");
        } else {
            System.out.println("Shipping: " + shippingCost);
        }
        System.out.println(shipping(100.0f,false,"Mexico"));
        System.out.println(shipping(50.0f,true,"US"));
        System.out.println(shipping(600.0f,false,"US"));
        System.out.println(shipping(100.0f,false,"Canada"));
    }
}
