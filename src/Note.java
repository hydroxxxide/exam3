import enums.NoteTypes;

import java.io.FileWriter;
import java.io.IOException;
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

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public void createEntry(String fileName) {
            try {
                FileWriter fileWriter = new FileWriter(fileName,true);
                fileWriter.write("              "+this.title+"        "+getDate()+"\n");
                fileWriter.write(this.getText()+"\n");
                System.out.println("Запись сделана");
                fileWriter.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
    }
}
