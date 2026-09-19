package parking;

public class Timestamp implements Comparable<Timestamp> {
    private Date date;
    private byte hour;
    private byte minute;

    // todo (added to remove interface error)
    @Override
    public int compareTo(Timestamp o) {
        return 0;
    }
}