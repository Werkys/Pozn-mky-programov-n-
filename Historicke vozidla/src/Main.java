import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vlastnik vlastnik1 = new Vlastnik("Jan Novak", LocalDate.of(1970, 1, 1));
        Vlastnik vlastnik2 = new Vlastnik("Petr Svoboda", LocalDate.of(1980, 2, 2));
        Vlastnik vlastnik3 = new Vlastnik("Karel Dvorak", LocalDate.of(1990, 3, 3));

        HistorickeVozidlo auto1 = new HistorickeVozidlo("Tatra", 1938, new BigDecimal("1000"), true, vlastnik1);
        HistorickeVozidlo auto2 = new HistorickeVozidlo("Skoda", 1940, new BigDecimal("2000"), false, vlastnik2);
        HistorickeVozidlo auto3 = new HistorickeVozidlo("Praga", 1950, new BigDecimal("3000"), true, vlastnik3);

        List<HistorickeVozidlo> jizda1 = new ArrayList<>();
        jizda1.add(auto1);
        jizda1.add(auto3);

        for (HistorickeVozidlo auto : jizda1) {
            System.out.println(auto.getTypVozidla() + " - " + auto.getRokVyroby());
        }

        List<HistorickeVozidlo> jizda2 = new ArrayList<>();
        jizda2.add(auto2);
        jizda2.add(auto3);

        for (HistorickeVozidlo auto : jizda2) {
            System.out.println(auto.getTypVozidla() + " - " + auto.getRokVyroby());
        }

        Jizdy jizda = new Jizdy(LocalDate.of(2024, 10, 1), "Praha");
        System.out.println(jizda);


        Random generator = new Random();
        List<Integer> seznamCisel = new ArrayList<>();
        Integer noveCislo = generator.nextInt(100) + 1;
        seznamCisel.add(noveCislo);

        System.out.println(seznamCisel);
    }
}
