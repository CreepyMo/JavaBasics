package vehicle;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private String color;

    // Default constructor
    public Vehicle(){}

    // Parameterized constructor
    public Vehicle(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Getters and Setters for the make
    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    // Getters and Setters for the model
    public String getModel(){return model;}

    public void setModel(String model){
        this.model = model;
    }

    // Getters and Setters for the year
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    // Getters and Setters for the color
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    // method start()
    public void start(){
        System.out.println("Vehicle is starting...");
    }

}
