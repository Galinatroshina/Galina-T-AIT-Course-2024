package homework_35.event_calendar.test;

import homework_35.event_calendar.dao.Calendar;
import homework_35.event_calendar.dao.EventCalendarImpl;
import homework_35.event_calendar.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class EventCalendarImplTest {

    Calendar calendar;
    Event[] events;

    LocalDateTime now = LocalDateTime.now();


    @BeforeEach
    void setUp() {

        calendar = new EventCalendarImpl(6);
        events = new Event[5];
        events[0] = new Event(1,1,"Meeting", now.minusDays(5));
        events[1] = new Event(1,2,"FSP", now.minusDays(2));
        events[2] = new Event(1,3,"KP", now.minusDays(1));
        events[3] = new Event(2,1,"Meeting", now.minusDays(2));
        events[4] = new Event(2,2,"Interview", now.minusDays(1));

        // TODO add photos to album
        for (int i = 0; i < 5; i++) {
            calendar.addEvent(events[i]);
        }
    }

    @Test
    void addEvent() {
        assertFalse(calendar.addEvent(null));
        assertFalse(calendar.addEvent((events[1]));
        Event event = new Event(1,4, "Job", now.minusDays(1));
        assertTrue(calendar.addEvent(event));
        assertEquals(6, calendar.size());
        event = new Event(2, 3, "Coffee", now.minusDays(3));
        assertFalse(calendar,addEvent(event));

    }

    @Test
    void removeEvent() {
    }

    @Test
    void updateEvent() {
    }

    @Test
    void getEventFromCalendar() {
    }

    @Test
    void getAllEventFrom() {
    }

    @Test
    void getEventBetweenDate() {
    }

    @Test
    void size() {
    }
}