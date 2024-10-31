package homework_35.event_calendar.dao;

import homework_35.event_calendar.model.Event;

import java.time.LocalDate;

public interface Calendar {

    boolean addEvent (Event event);
    boolean removeEvent (int eventId, int calendarId);
    boolean updateEvent (int eventId, int calendarId, String title);
    Event getEventFromCalendar (int eventId, int calendarId, String title);
    Event[] getAllEventFrom (int calendarId);
    Event[] getEventBetweenDate (LocalDate dateFrom, LocalDate dateTo);
    int size();

}
