package dc;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Osoba os1 = new Osoba();
        SimpleDateFormat data = new SimpleDateFormat("2021-11-11");
        Osoba os2 = new Osoba("Jan", "Nowak", data);
        System.out.println(os2.toString());
    }
}
