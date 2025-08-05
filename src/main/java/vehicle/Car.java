package vehicle;

public class Car extends Vehicle{

    private int numberOfDoors;
    private boolean isElectric;

    //Constructor that takes all fields and uses super()
    public Car(String make, String model, int year, String color, int numberOfDoors, boolean isElectric){
        super(make, model, year, color);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    // Constructor with only make, model and year
    public Car(String make, String model, int year){
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric(){
        return isElectric;
    }

    public void setElectric(boolean electric){
        isElectric = electric;
    }

    @Override
    public void start(){
        if (isElectric == true){
            System.out.println("Car is starting silently...");
        } else {
            System.out.println("Car is starting with key...");
        }
    }

    //A method displayInfo() that prints all car info in a human readable manner
    public void displayInfo(){
        System.out.println();
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Car Info:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println("Number of Doors: " + getNumberOfDoors());
        System.out.println("Electric: " + (isElectric? "Yes" : "No"));
        System.out.println();
    }

    // Over load method drive()
    public void drive(){
        System.out.println("Car is driving...");
    }

    public void drive(int speed){
        System.out.println("Car is driving at " + speed + " km/h");
    }

}
