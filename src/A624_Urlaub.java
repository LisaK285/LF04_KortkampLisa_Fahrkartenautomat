import java.util.Scanner;


public class A624_Urlaub {
	
	public static double budgetEingabe(Scanner tastatur){
		System.out.println("Geben Sie ihr Reisebudget in Euro an: ");
		double budgetEingabe = tastatur.nextDouble();
		return budgetEingabe;
	}
	public static double waehrungKonverter(Scanner tastatur, double reiseBudget) {
		System.out.println("Wieviel wollen Sie wechseln?");
		double wechselBetrag = tastatur.nextDouble();
		if(wechselBetrag > reiseBudget) {
			System.out.println("Betrag übersteigt verbleibende Budget. Bitte geben Sie einen neuen Betrag ein: ");
			double newBetrag = tastatur.nextDouble();
		}
		System.out.println("In welche Währung wollen Sie wechseln?: ");
		String wechselWaehrung = tastatur.next();
		String waehrungsName;
		double convertedBudget;
		double newBudget = 0;
		switch(wechselWaehrung) {
		case "dollar", "Dollar", "USD", "usd":
			convertedBudget = wechselBetrag * 0.98;
			waehrungsName = "Dollar";
			System.out.println("Dein Budget in Ziehlwährungs:" + convertedBudget + "\n" + "Name der Währung: " +waehrungsName);
			newBudget = reiseBudget - wechselBetrag;
			break;
		case "yen", "Yen", "JPY", "jpy":
			convertedBudget = wechselBetrag * 141;
			waehrungsName = "Yen";
			System.out.println("Dein Budget in Ziehlwährungs:" + convertedBudget + "\n" + "Name der Währung: " +waehrungsName);
			newBudget = reiseBudget - wechselBetrag;
			break;
		case "Pfund", "pfund", "GBP", "gbp":
			convertedBudget = wechselBetrag * 0.88;
			waehrungsName = "Pfund";
			System.out.println("Dein Budget in Ziehlwährungs:" + convertedBudget + "\n" + "Name der Währung: " +waehrungsName);
			newBudget = reiseBudget - wechselBetrag;
			break;
		case "Franken", "franken", "CHF", "chf":
			convertedBudget = wechselBetrag * 0.96;
			waehrungsName = "Franken";
			System.out.println("Dein Budget in Ziehlwährungs:" + convertedBudget + "\n" + "Name der Währung: " +waehrungsName);
			newBudget = reiseBudget - wechselBetrag;
			break;
		case "Kronen", "kronen", "DKK", "dkk":
			convertedBudget = wechselBetrag * 7.44;
			waehrungsName = "Kronen";
			System.out.println("Dein Budget in Ziehlwährungs:" + convertedBudget + "\n" + "Name der Währung: " +waehrungsName);
			newBudget = reiseBudget - wechselBetrag;
			break;
		}
		return newBudget;}
	
	public static boolean reserveErreicht(double reiseBudget, double currentBudget) {
		if ((reiseBudget*0.1) > currentBudget) {
				return  false;
			}
		else{
			return true;}
		}
	
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		
		double reiseBudget = budgetEingabe(tastatur);
		
		double currentBudget = waehrungKonverter(tastatur, reiseBudget);
		
		boolean reiseFortsetzung = reserveErreicht(reiseBudget, currentBudget);
		
		if(!reiseFortsetzung) {
			System.out.println("Reserve erreicht. Wollen Sie Ihr Budget erhöhen?");
			String benutzerAntwort = tastatur.next();
			if(benutzerAntwort == "Ja") {
				System.out.println("Um wieviel wollen Sie Ihr Budget erhöhen?");
				double budgetErhoehung = tastatur.nextDouble();
				currentBudget =+ budgetErhoehung;
		}	else if (benutzerAntwort == "Nein") {
			System.out.println("Eine schöne Heimreise!");
			}
		else {waehrungKonverter(tastatur, currentBudget);}
		}
		tastatur.close();
	}
}