package homework_35.event_calendar.dao;

import classwork_35.ait.model.Photo;
import homework_35.event_calendar.model.Event;

import java.time.LocalDate;
import java.util.Comparator;

public class EventCalendarImpl implements Calendar {

    private Event[] events;
    private int size;

    public EventCalendarImpl (int capacity){
        this.events = new Event[capacity];
    }

    Comparator<Event> comparator = (e1, e2) -> {
        int res = Integer.compare(e1.getCalendarId(), e2.getCalendarId());
        return res !=0 ? res : Integer.compare(e1.getEventId(), e2.getEventId());

    };

    @Override
    public boolean addEvent(Event event) {
        if(event == null || size == events.length || ){

        }
        return false;
    }

    @Override
    public boolean removeEvent(int eventId, int calendarId) {
        return false;
    }

    @Override
    public boolean updateEvent(int eventId, int calendarId, String title) {
        return false;
    }

    @Override
    public Event getEventFromCalendar(int eventId, int calendarId, String title) {
        return null;
    }

    @Override
    public Event[] getAllEventFrom(int calendarId) {
        return new Event[0];
    }

    @Override
    public Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Event[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
