import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia;
    private ArrayList<Klient> klienci;

    public SystemRezerwacji() {
        wydarzenia = new ArrayList<>();
        klienci = new ArrayList<>();
    }

    // Dodaj wydarzenie — wersja 1
    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    // Dodaj wydarzenie — wersja 2 (tworzenie od razu)
    public void dodajWydarzenie(String nazwa, double cena) {
        wydarzenia.add(new Wydarzenie(nazwa, cena));
    }

    // Dodaj klienta — wersja 1
    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    // Dodaj klienta — wersja 2 (tworzenie od razu)
    public void dodajKlienta(String imie, String nazwisko, String email) {
        klienci.add(new Klient(imie, nazwisko, email));
    }

    // Rezerwacja miejsca
    public boolean dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            klient.dodajRezerwacje(wydarzenie);
            return true;
        } else {
            System.out.println("Brak dostępnych miejsc na: " + wydarzenie.getNazwa());
            return false;
        }
    }

    // Szukaj wydarzenia po nazwie
    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                return w;
            }
        }
        return null;
    }

    // Szukaj klienta po nazwisku
    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : klienci) {
            if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return k;
            }
        }
        return null;
    }

    // Zmiana ceny wydarzenia
    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
        }
    }
}
