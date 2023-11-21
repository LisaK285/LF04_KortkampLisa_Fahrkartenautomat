import java.util.Scanner;

public class A623_PCHaendler {
	
	public static String liesString(Scanner tastatur, String text) {
		System.out.println(text);
		String readString = tastatur.next();
		return readString;
	}
    public static int liesInt(Scanner tastatur, String text) {
    	System.out.println(text);
    	int readInt = tastatur.nextInt();
    	return readInt;
     }
    public static double liesDouble(Scanner tastatur, String text) {
    	System.out.println(text);
    	double readDouble =  tastatur.nextDouble();
    	return readDouble;
    }
    public static double berechneNettopreis(int anzahl, double nettopreis) {
    	double nettogesamtpreis = anzahl * nettopreis;
    	return nettogesamtpreis;
    }
    public static double berechneBruttopreis(double nettogesamtpreis, double mwst) {
    	double bruttogesamtpreis = nettogesamtpreis * (1 + mwst / 100);
    	return bruttogesamtpreis;
    }
    public static void rechnungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
    	System.out.println("\\Rechnung");
        System.out.printf("Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        System.out.printf("Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    }

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        // Eingabe
        String artikelBestellung = "Was moechten Sie bestellen: ";
        String artikel = liesString(tastatur, artikelBestellung);

        String artikelAnzahl = "Geben Sie die Anzahl ein: ";
        int anzahl = liesInt(tastatur, artikelAnzahl);

        String artikelNettoPreis = "Geben Sie den Nettopreis ein: ";
        double nettopreis = liesDouble(tastatur, artikelNettoPreis);

        String artikelMwstSatz = "Geben Sie den Mehrwertsteuersatz in Prozent ein: ";
        double mwst = liesDouble(tastatur, artikelMwstSatz);

        // Verarbeitung
        double nettogesamtpreis = berechneNettopreis(anzahl, nettopreis);
        double bruttogesamtpreis = berechneBruttopreis(nettogesamtpreis, mwst);

        // Ausgabe
        
        rechnungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);

        tastatur.close();
    }
}

