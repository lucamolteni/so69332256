package drools.project;

public class BookEvent {
    BookEventType type;

    public BookEvent(BookEventType type) {
        this.type = type;
    }

    public BookEventType getType() {
        return type;
    }

    public void setType(BookEventType type) {
        this.type = type;
    }
}
