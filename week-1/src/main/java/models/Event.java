package models;

public class Event {

    private int guests;
    private String food;
    private String beverage;


    public Event() {
        this.guests = 0;
        this.food = "none";
        this.beverage = "none";
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
}
