package parking;

public class DeckList {
    private static final int ARRAYLENGTH = 4;
    private static final int NOTFOUND = -1;
    private Deck[] decks;
    private int numDecks;
    private int find(Deck deck) {
        return 0; //todo
    } //find deck in array
    private void grow() {} //resize the array
    public void open(Deck deck) {} //add to end of array
    public void close(Deck deck) {} //mark deck as closed
    public boolean contains(Deck deck) {
        return false; //todo
     }
    public void printByLocation() {}
    public void printVehicles(Deck deck) {}
}