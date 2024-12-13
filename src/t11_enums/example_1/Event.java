package t11_enums.example_1;

// Пример БЕЗ enum
public class Event {
    private final String title;
    private final Season season;

    public Event(String title, Season season) {
        this.title = title;
        this.season = season;
    }

    public String getTitle() {
        return title;
    }

    public Season getSeason() {
        return season;
    }
}
