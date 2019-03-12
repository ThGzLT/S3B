package Sprendimas;

import static Sprendimas.Skaiciavimas.skaiciavimas;

public class Main {
    public static void main(String[] args) {
        long TeigiamuKiekis = skaiciavimas(65, 8921);

        System.out.println("Palyginimas davė " + TeigiamuKiekis + " teigiamus rezultatus po 1‘000‘000 (1 milijono) palyginimų.");
    }
}
