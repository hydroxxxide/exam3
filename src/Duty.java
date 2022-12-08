import enums.NoteTypes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Duty extends Note{
    public Duty(String text, LocalDate date, NoteTypes types, String title, BigDecimal sumOfDuty) {
        super(text, date, types, title);
        this.sumOfDuty = sumOfDuty;
    }

    private BigDecimal sumOfDuty;

    public BigDecimal getSumOfDuty() {
        return sumOfDuty;
    }

    public void setSumOfDuty(BigDecimal sumOfDuty) {
        this.sumOfDuty = sumOfDuty;
    }
}
