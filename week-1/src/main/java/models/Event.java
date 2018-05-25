package models;

import java.util.HashMap;
import java.util.Map;

public class Event {

    private int guests;
    private String food;
    private String beverage;
    private String entertainment;
    private int bookingFee;
    private Map<String, Double> foodItemsAndPrices;


    public Event() {
        this.guests = 0;
        this.food = "none";
        this.beverage = "none";
        this.entertainment = "none";
        this.bookingFee = 150;
        this.foodItemsAndPrices = new HashMap();
        foodItemsAndPrices.put("none", 0.00);
        foodItemsAndPrices.put("small", 300.00);
        foodItemsAndPrices.put("medium", 600.00);
        foodItemsAndPrices.put("large", 1500.00);
        foodItemsAndPrices.put("xl", 3000.00);

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

    public int setBookingFee(){
        return this.bookingFee;
    }

    public Map<String, Double> getFoodItemsAndPrices() {
        return this.foodItemsAndPrices;
    }

    public void setFoodSelection(String userInputFoodSelection) {
        this.food = userInputFoodSelection;
    }
}
