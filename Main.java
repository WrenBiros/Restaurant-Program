public class Main {
    public static void main(String[] args) {

        Restaurant mcDonalds = new Restaurant(30, 3.5, 12, 2, "2:00AM - 11:00PM");
        Restaurant chipotle = new Restaurant(30, 4.5, 14, 5,
                "6:00AM - 9:00PM");

        System.out.println("chipotle");

        System.out.println(chipotle.waitTime);
        System.out.println(chipotle.avgPrice);
        System.out.println(chipotle.distance);
        System.out.println(chipotle.hoursOpen);
        System.out.println(chipotle.rating);

        System.out.println("McDonalds");

        System.out.println(mcDonalds.waitTime);
        System.out.println(mcDonalds.avgPrice);
        System.out.println(mcDonalds.distance);
        System.out.println(mcDonalds.hoursOpen);
        System.out.println(mcDonalds.rating);
    }
}
