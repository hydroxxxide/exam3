import enums.NoteTypes;
import enums.NumberTypes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {

        Note note1 = new Note("text", LocalDate.now(), NoteTypes.IDEA, "New idea");
        Note duty2 = new Duty("text", LocalDate.now(), NoteTypes.DUTY, "New duty", BigDecimal.valueOf(213421412));
        Note note3 = new Note("text", LocalDate.now(), NoteTypes.IDEA, "New idea");

        Contacts contact1 = new Contacts("New contact",
                LocalDate.now(),
                NoteTypes.IDEA,
                "0500 654 016",
                "Khashem",
                NumberTypes.MOBILE);

        Contacts contact2 = new Contacts("New contact",
                LocalDate.now(),
                NoteTypes.IDEA,
                "0706 165 545",
                "Mom",
                NumberTypes.MOBILE);

        Contacts contact3 = new Contacts("New contact",
                LocalDate.now(),
                NoteTypes.IDEA,
                "0990 994 727",
                "Adelina",
                NumberTypes.MOBILE);


        AbstractNote[] list = new AbstractNote[6];
        list[0] = contact1;
        list[1] = contact2;
        list[2] = contact3;
        list[3] = note1;
        list[4] = duty2;
        list[5] = note3;

    }
}