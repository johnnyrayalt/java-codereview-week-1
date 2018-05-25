package models;

public class Event {

    private int guests;
    private String food;
    private String beverage;
    private String entertainment;


    public Event() {
        this.guests = 0;
        this.food = "none";
        this.beverage = "none";
        this.entertainment = "none";
    }

    public int getGuests() {
        return this.guests;
    }

    public String getFood() {
        return this.food;
    }

    public String getBeverage() {
        return this.beverage;
    }

    public String getEntertainment() {
        return this.entertainment;
    }

    public int setGuests(int userInputNumberOfGuests) {
        return this.guests = userInputNumberOfGuests;
    }

}
