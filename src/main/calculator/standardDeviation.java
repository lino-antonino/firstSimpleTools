package calculator;

public class standardDeviation {
    public static void main(String[] args) {
        double[] zahlen = {25640, 1820, 593, 627, 658, 663, 920, 425, 506, 1212, 620, 426, 1264, 517, 587, 556};

        // Berechne beide Varianzen und die Standardabweichung
        double[] varianten = berechneVarianzUndStandardabweichung(zahlen);

        // Ausgabe der Ergebnisse
        System.out.println("Mittelwert: " + varianten[0]);

        //System.out.println("Varianz (n): " + varianten[0]);
        System.out.println("Standardabweichung (n): " + Math.sqrt(varianten[1]));

        //System.out.println("Varianz (n-1): " + varianten[1]);
        System.out.println("Standardabweichung (n-1): " + Math.sqrt(varianten[2]));
    }

    public static double[] berechneVarianzUndStandardabweichung(double[] daten) {
        double summe = 0.0;
        double mittelwert;

        // Berechnung des Mittelwerts
        for (double zahl : daten) {
            summe += zahl;
        }
        mittelwert = summe / daten.length;

        // Berechnung der quadratischen Abweichungen
        double quadratSumme = 0.0;
        for (double zahl : daten) {
            quadratSumme += Math.pow(zahl - mittelwert, 2);
        }

        // Varianzberechnung für Grundgesamtheit (n) und Stichprobe (n-1)
        double varianzGesamtheit = quadratSumme / daten.length;
        double varianzStichprobe = quadratSumme / (daten.length - 1);

        // Rückgabe der beiden Varianzen als Array
        return new double[]{mittelwert, varianzGesamtheit, varianzStichprobe};
    }
}
