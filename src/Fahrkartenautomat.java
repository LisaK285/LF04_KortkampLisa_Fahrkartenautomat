import java.util.Scanner;

class Fahrkartenautomat {
	
	public static void begruessung() {
	System.out.println("Herzlich Willkommen!");	
	}
	
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		System.out.print("Zu zahlender Betrag (Euro): ");
		double zuZahlenderBetrag = tastatur.nextDouble();
		if(zuZahlenderBetrag < 0.05) {
			zuZahlenderBetrag = 1;
			System.out.print("Fehlerhafte Eingabe. Ticketpreis wird auf 1€ gesetzt.");
		}
		System.out.print("Anzahl der Tickets: ");
		int anzahlTickets = tastatur.nextInt();
		if (anzahlTickets < 1 || anzahlTickets > 10) {
			anzahlTickets = 1;
			System.out.println("Fehlerhafte Eingabe. Ticketanzahl wird auf 1 gesetzt.");
		}
		
		
		return zuZahlenderBetrag * anzahlTickets;
	}
	
	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
		double eingeworfeneMuenze;
		double eingezahlterGesamtBetrag;
		double eingezahlterGesamtbetrag = 0.0;
		double nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f \n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			
			boolean isValid = false;
			if (eingeworfeneMuenze ==0.05 || eingeworfeneMuenze == 0.1 ||eingeworfeneMuenze ==  0.2 ||eingeworfeneMuenze  ==  0.5 ||eingeworfeneMuenze ==  1 ||eingeworfeneMuenze ==  2) {
				isValid = true;
			} else if (eingeworfeneMuenze == 5 ||eingeworfeneMuenze ==  10 ||eingeworfeneMuenze ==  20) {
				isValid = true;
			}
			if (isValid == true) {
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;}
			else {System.out.println("Kein gültiges Zahlungsmittel.");
			}}
			return eingezahlterGesamtbetrag;
	}
	public static void fahrkartenAusgabe() {
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}
	
	public static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {
		double rueckgabebetrag;
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro ", rueckgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
				rueckgabebetrag = Math.round(rueckgabebetrag * 20) / 20;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;

				rueckgabebetrag = Math.round(rueckgabebetrag * 20) / 20;
			}
		}
		
		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");
	}
	public static void main(String[] args) {
		
		/*A3.1: Ausgabe des Fahrkartenautomaten angepasst
		 * A3.2: Anzahl der Tickets hinzufügen
		 * A3.3: Fehlerbeseitigung?
		 * A4.1: Ticketgrenzen im Fahrkartenautomat eingefügt
		 * A4.3: Geldeingabe überprüfen
		 * A6.3: Methoden
		 *  */
		
		

		Scanner tastatur = new Scanner(System.in);
		begruessung();

		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;

		// 1
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		
		// 3
		
		fahrkartenAusgabe();
		
		// 4
		rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);
		

		tastatur.close();
	}
}