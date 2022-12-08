import enums.NoteTypes;
import enums.NumberTypes;

import java.time.LocalDate;

public abstract class AbstractNote { //Абстрактная Заметка - абстрактный класс

    private String text;
    private LocalDate date;
    private NoteTypes types;

    public AbstractNote(String text, LocalDate date, NoteTypes types) {
        this.text = text;
        this.date = date;
        this.types = types;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public NoteTypes getTypes() {
        return types;
    }

    public void setTypes(NoteTypes types) {
        this.types = types;
    }

}
