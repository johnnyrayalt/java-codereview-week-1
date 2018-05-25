package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_numberOfGuests_is0() {
        Event testEvent = new Event();
        assertEquals(0, testEvent.getGuests());
    }

    @Test
    public void newEvent_typeOfFood_isNone() {
        Event testEvent = new Event();
        assertEquals("none", testEvent.getFood());
    }

    @Test
    public void newEvent_typeOfBeverage_isNone() {
        Event testEvent = new Event();
        assertEquals("none", testEvent.getBeverage());
    }

    @Test
    public void newEvent_typeofEntertainment_isNone() {
        Event testEvent = new Event();
        assertEquals("none", testEvent.getEntertainment());
    }

    @Test
    public void newEvent_setGuests_is1() {
        Event testEvent = new Event();
        int userInputNumberOfGuests = 1;;
        assertEquals(1, testEvent.setGuests(userInputNumberOfGuests));
    }

    @Test
    public void newEvent_setBookingFee_is150() {
        Event testEvent = new Event();
        assertEquals(150, testEvent.setBookingFee());
    }
}