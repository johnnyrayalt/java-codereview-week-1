package models;

public class Event {

    private int guests;
    private String food;


    public Event() {
        this.guests = 0;
        this.food = "none";
    }

    public int getGuests() {
        return guests;
    }

    public String getFood() {
        return food;
    }
}
