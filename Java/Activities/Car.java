public class Car {
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;

    Car() {
        tyres = 4;
        doors = 4;
    }
    public void displayCharacteristics() {
        System.out.println("CAR COLOR:" + color);
        System.out.println("CAR MAKE:" + make);
        System.out.println("CAR TRANMISSION:" + transmission);
        System.out.println("CAR TYRES:" + tyres);
        System.out.println("CAR DOORS:" + doors);
    }
    public void accelerate() {
	System.out.println("Car is moving forward.");
    }
	
    public void brake() {
	System.out.println("Car has stopped.");
    }
}
    

