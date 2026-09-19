package parking;

public enum Location {
    Bridgewater ("Somerset County", "08807"),
    Piscataway ("Middlesex County", "08854"),
    Edison ("Middlesex County", "08817"),
    Princeton ("Mercer County", "08542"),
    Morristown ("Morris County", "07960"),
    Clark ("Union County", "07066");

    private final String city;
    private final String zipcode;

    Location(String city, String zipcode){
        this.city = city;
        this.zipcode = zipcode;
    }


}
