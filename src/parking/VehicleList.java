package parking;

public class VehicleList {
    private static final int LENGTH = 4;
    private static final int NOTFOUND = -1;
    private Vehicle[] vehicles;
    private int numVehicles;
    private int find(Vehicle vehicle) {
        return 0; //update!
    } //find vehicle in array
    private void grow() {} //resize the array
    public void add(Vehicle vehicle) {} //add to end of array
    public void remove(Vehicle vehicle) {} //replace with last element
    public boolean contains(Vehicle vehicle) {
        return true; //update!
    }
    public void printByPlate() {}
    public void printHistory() {}
}