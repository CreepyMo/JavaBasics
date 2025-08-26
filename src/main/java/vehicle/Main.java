package vehicle;

public class Main {
    public static void main(String[] args){

        //Create at least two Car objects:
        //○ One using the full constructor
        //○ One using the partial constructor and setters

        Car c1 = new Car("BMW", "i3", 2021, "White", 4, true);
        Car c2 = new Car("Subaru", "Impreza", 2007);
        
        // Use setters for the second car as required
        c2.setColor("Red");
        c2.setNumberOfDoors(5);
        c2.setElectric(false);

        c1.displayInfo();
        c1.start();
        c1.drive();
        c1.drive(70);

        c2.displayInfo();
        c2.start();
        c2.drive();
        c2.drive(90);
    }
}
