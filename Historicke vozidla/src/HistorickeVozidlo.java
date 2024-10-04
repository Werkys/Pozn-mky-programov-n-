import java.math.BigDecimal;

public class HistorickeVozidlo {
    private String typVozidla;
    private int rokVyroby;
    private BigDecimal cenaPojisteni;
    private boolean jeZPrvniRepubliky;
    private Vlastnik vlastnik;

    public int getRokVyroby() {
        return rokVyroby;
    }
    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }
    public String getTypVozidla() {
        return typVozidla;
    }
    public HistorickeVozidlo(String typVozidla, int rokVyroby, BigDecimal cenaPojisteni, boolean jeZPrvniRepubliky, Vlastnik vlastnik) {
        this.typVozidla = typVozidla;
        this.rokVyroby = rokVyroby;
        this.cenaPojisteni = cenaPojisteni;
        this.jeZPrvniRepubliky = jeZPrvniRepubliky;
        this.vlastnik = vlastnik;
    }

}
