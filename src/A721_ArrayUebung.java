import java.util.Arrays;


public class A721_ArrayUebung {

	
	public static void main(String[] args) {
		int[] zahlen = {1, 6, 3, 7, 2};
		int i = 4;
		System.out.println(zahlen[1]); //6
		//System.out.println(zahlen[5]); //Out of bounds
		System.out.println(zahlen[3]); //7
		System.out.println(zahlen[i]); //2
		System.out.println(zahlen[i-2]); //3
		System.out.println(zahlen[zahlen[4]]); //3
		
		
		// 1. Deklaration eines Arrays für ganze Zahlen. X

	    // 2. Initialisierung des Arrays mit 100 Elementen. X

	    // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts. X

	    // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen. X

	    // 5. Geben Sie den Wert an der 89. Position des Arrays aus. x

	    // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060. x

	    // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2023. x

	    // 7. Erneutes Ausgeben des Arrayinhalts.  Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7) x

	    // 8. Berechnung des Durchschnitts aller Arrayelemente X
		
		int[] ganzeZahlen = new int [100];
		for(int index = 0; index < ganzeZahlen.length; index++) {
			ganzeZahlen[index] = index+1;
			//System.out.println(ganzeZahlen[index]);
		}
		
		//System.out.println(ganzeZahlen[89]);
		ganzeZahlen[49] = 1060;
		ganzeZahlen[0] = 2023;
		ganzeZahlen[ganzeZahlen.length-1] = 2023;
		
		//for (int j = 0; j < ganzeZahlen.length; j++) {
			//System.out.println("Index: " + j + " - Inhalt:" + ganzeZahlen[j]);
			
		//}
		int durchschnitt = 0;
		
		for (int addNumber = 0; addNumber < ganzeZahlen.length; addNumber++) {
			durchschnitt = durchschnitt + ganzeZahlen[addNumber];
		}
		durchschnitt = (durchschnitt / ganzeZahlen.length);
		//System.out.println(durchschnitt);
		
		int[] zahlenZwei = {3,4,2,3,5,1,2,7,2,1,2,4};
		int[] duplicateNums = new int[zahlenZwei.length];
		
		for(int ind=0; ind < zahlenZwei.length; ind++) {
			for(int din = 0; din < zahlenZwei.length; din++) {
				if(zahlenZwei[ind] == zahlenZwei[din]) {
					duplicateNums[ind] = zahlenZwei[ind];
				}
			}
		}
		
		
		Arrays.sort(duplicateNums);
		for(int di = 0; di < duplicateNums.length; di++) {
			System.out.println(duplicateNums[di]);
		}
	}

	}
	

