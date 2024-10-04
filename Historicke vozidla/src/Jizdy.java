import java.time.LocalDate;

public class Jizdy {
    private LocalDate datum;
    private String misto;

    public Jizdy(LocalDate of, String praha) {
    }


    @Override
    public String toString() {
        return "Jizda: " + datum + " - " + misto;
    }
}



