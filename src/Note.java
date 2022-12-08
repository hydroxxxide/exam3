import enums.NoteTypes;

import java.time.LocalDate;

public class Note extends AbstractNote{ //Заметка (Наследник -> Заметка)
    private String title;

    public Note(String text, LocalDate date, NoteTypes types, String title) {
        super(text, date, types);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
