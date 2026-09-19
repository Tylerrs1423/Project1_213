package parking;

/**
 *
 */
public class Vehicle {
    public static final int PLATELENGTH = 7;
    private String plate; //exactly 7 characters
    private History history; //a singly linked list

    public Vehicle(String plate){
        System.out.println(validatePlate(plate));

        this.plate = plate;
        this.history = null;
    }
    public void printHistory(
    ) {}; //print parking history

    private boolean validatePlate(String plate){
        return plate.matches("[A-Za-z]\\d{2}-[A-Za-z]{3}");
    }
}