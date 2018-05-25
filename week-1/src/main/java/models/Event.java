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
        return guests;
    }

    public String getFood() {
        return food;
    }

    public String getBeverage() {
        return beverage;
    }

    public String getEntertainment() {
        return entertainment;
    }
}
