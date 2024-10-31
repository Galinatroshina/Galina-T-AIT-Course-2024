package homework_35.event_calendar.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event implements Comparable<Event>{

    private int calendarId;
    private int eventId;
    private String title;
    private LocalDateTime date;

    public Event(int calendarId, int eventId, String title, LocalDateTime date) {
        this.eventId = eventId;
        this.title = title;
        this.date = date;
        this.calendarId = calendarId;
    }



    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(int calendarId) {
        this.calendarId = calendarId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return calendarId == event.calendarId && eventId == event.eventId && Objects.equals(title, event.title) && Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calendarId, eventId, title, date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("calendarId=").append(calendarId);
        sb.append(", eventId=").append(eventId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Event o) {
        return 0;
    }
}
