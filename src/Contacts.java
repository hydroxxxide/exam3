import enums.NoteTypes;
import enums.NumberTypes;

import java.time.LocalDate;

public class Contacts extends AbstractNote{
    public Contacts(String text, LocalDate date, NoteTypes types, String phoneNumber, String contactName, NumberTypes types1) {
        super(text, date, types);
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
        this.numberTypes = types1;
    }



    private String phoneNumber; //Номер телефона
    private String contactName; //Имя контакта
    private NumberTypes numberTypes; //Тип номера

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public NumberTypes getNumberTypes() {
        return numberTypes;
    }

    public void setNumberTypes(NumberTypes numberTypes) {
        this.numberTypes = numberTypes;
    }
}
