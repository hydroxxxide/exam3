import enums.NoteTypes;

import java.io.FileWriter;
import java.io.IOException;
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

    @Override
    public String toString() {
        return "Duty{" +
                "sumOfDuty=" + sumOfDuty +
                '}';
    }

    @Override
    public void createEntry(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.write("              "+getTitle()+"        "+getDate()+"\n");
            fileWriter.write(this.getText()+"\n");
            System.out.println("Запись сделана");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
