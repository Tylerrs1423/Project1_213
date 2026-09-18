package parking;

public class Deck {
    public static final int MAXCAPACITY = 6;
    private int number; //deck number
    private Location location; //Location is a enum class
    private Hour hour; //Hour is a enum class
    private Parking[] parkings; //a list of parking activities
    private int numParked; //number of parking activities in array
    private boolean open;
    private int find(Vehicle vehicle){}
    public void enter(Parking parking) //add parking to array
    public void exit(Parking parking) //remove parking from array
}