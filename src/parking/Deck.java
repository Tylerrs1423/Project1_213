package parking;

public class Deck {
    public static final int MAXCAPACITY = 6;
    private int number; //deck number
    private Location location; //Location is a enum class
    private Hour hour; //Hour is a enum class
    private Parking[] parkings; //a list of parking activities
    private int numParked; //number of parking activities in array
    private boolean open;

    public Deck(int number, Location location, Hour hour, int numParked, boolean open) {
        this.number = number;
        this.location = location;
        this.hour = hour;
        this.numParked = 0;
        this.open = true;

    }

    private int find(Vehicle vehicle){
        return 0; // todo!
    }

    public Deck(int number, Location location ) {

    }
    public void enter(Parking parking){
        parkings[this.numParked] = parking;
    } //add parking to array
    public void exit(Parking parking){

    } //remove parking from array
}