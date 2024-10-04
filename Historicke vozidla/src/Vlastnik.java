import java.time.LocalDate;
public class Vlastnik {
    private String jmeno;
    private LocalDate datumNarozeni;

    public Vlastnik(String jmeno, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
    }
}
