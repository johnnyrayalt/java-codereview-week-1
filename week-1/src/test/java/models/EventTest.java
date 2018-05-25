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
}