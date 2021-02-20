/*
 Vehicle class - a class that creates a car object
 @author Izzeldeen 3694241
 */

public class Vehicle {

    // instance variables
    private int identification;
    private int numofpassengers;
    private int numofaxels;
    private int weight;


    // method to give an ID for each car
    public void randomID(){
        int counter = 100;
        identification = counter;
        counter++;
    }
    /*
    This method is constructor for creating a car class
    @param numofpassengersIn - the number of passengers in the car
    @param numofaxelsIn - the number of axels in the car
    @param weightIn - the weight of the car
     */
    public Vehicle (int numofpassengersIn, int numofaxelsIn, int weightIn){
        numofpassengers = numofpassengersIn;
        numofaxels = numofaxelsIn;
        weight = weightIn;
    }

    // accessor methods
    public int getPassenger(){
        return numofpassengers;
    }
    public int getAxels(){
        return numofaxels;
    }
    public int getIdentification(){
        return identification;
    }
    public int getWeight(){
        return weight;
    }
    public int getID(){return identification;}

    // mutator methods
    // @param numOfPassenger - is the number of passengers
    public void setPassengers(int newNumOfPassenger){
        newNumOfPassenger = newNumOfPassenger;
    }


}