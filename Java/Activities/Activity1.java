public class Activity1 {
    public static void main(String[] args) {
        Car Nissan =new Car();
        Nissan.make= 2014;
        Nissan.color = "Black";
        Nissan.transmission = "Manual";

        Nissan.displayCharacteristics();
        Nissan.accelerate();
        Nissan.brake();
    }
}
