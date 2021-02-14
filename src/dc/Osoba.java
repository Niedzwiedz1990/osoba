package dc;

import java.text.SimpleDateFormat;

public class Osoba {
    public String getImię() {
        return imię;
    }
    public void setImię(String imię) {
        this.imię = imię;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public SimpleDateFormat getDataUrodzenia() {
        return dataUrodzenia;
    }
    public void setDataUrodzenia(SimpleDateFormat dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
    private String imię;
    private String nazwisko;
    private SimpleDateFormat dataUrodzenia;
    Osoba() {};
    Osoba(String imię, String nazwisko, SimpleDateFormat dataUrodzenia) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    @Override
    public String toString() {
        return imię + " " + nazwisko;
    }
}
