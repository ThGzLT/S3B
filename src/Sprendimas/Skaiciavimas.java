package Sprendimas;

class Skaiciavimas {

    static long skaiciavimas(long APreiksme, long BPreiksme) {
        long AKof = 16807;
        long BKof = 48271;
        long ResultA = APreiksme;
        long ResultB = BPreiksme;
        long Bandymai = 1000000;
        int Bitukiekis = 8;
        int count = 0;
        for (int i = 0; i < Bandymai; i++) {
            ResultA = ResultA * AKof % 2147483647;
            String ADvejetainis = Long.toBinaryString(ResultA);
            ResultB = ResultB * BKof % 2147483647;
            String BDvejetainis = Long.toBinaryString(ResultB);

            if (ADvejetainis.length() > Bitukiekis) {
                ADvejetainis = ADvejetainis.substring(ADvejetainis.length() - Bitukiekis);
                if (BDvejetainis.length() > Bitukiekis) {
                    BDvejetainis = BDvejetainis.substring(BDvejetainis.length() - Bitukiekis);
                }
            }
            if (ADvejetainis.equals(BDvejetainis)) {
                count++;
            }
        }
        // System.out.println("Su parametrais " + APreiksme + " ir " + BPreiksme + " rezultatas " + count + " iš " + bandymai + " bandymų");

        return count;

    }
}
