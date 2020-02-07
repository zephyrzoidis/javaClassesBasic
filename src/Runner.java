public class Runner {

    public static void main(String[] args) {

        Car toyota = new Car(2000, "Prius", "Toyota");

        System.out.println(toyota.toString());

        toyota.setMiles(100000);

        System.out.println(toyota.toString());

        Rectangle orange = new Rectangle(7, 7);

        System.out.println(orange.printData());
    }
}
