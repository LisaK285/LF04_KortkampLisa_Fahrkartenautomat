
public class A621_Volumen {
	
	public static int volumenBerechner(int laengeWuerfel) {
		return laengeWuerfel * laengeWuerfel * laengeWuerfel;
	}

	public static void main(String[] args) {
		int volumenEins = volumenBerechner(3);
		int volumenZwei = volumenBerechner(25);
		System.out.println(volumenEins);
		System.out.println(volumenZwei);

	}

}
