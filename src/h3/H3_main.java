package h3;

public class H3_main {

	public static void main(String[] args) {
		int i = 300;
		int j = 400;
		int k = 0;
		
		boolean ausdruck1, ausdruck2, ausdruck3;
		ausdruck1 = i > j;
		ausdruck2 = i > 200;
		ausdruck3 = j > 100;

		// Wir stellen sicher, dass der default für k auf -10 gesetzt wird, egal mit welchem Wert k initialisetr wird.
		k = -10;


		if (ausdruck1 && !ausdruck2 && !ausdruck3) {
			k = 1;
		}

		if (ausdruck1 && ausdruck2 && !ausdruck3) {
			k = 2;
		}

		if (ausdruck1 && ausdruck2 && ausdruck3) {
			k = 3;
		}

		if (!ausdruck1 && !ausdruck2 && !ausdruck3) {
			k = 4;
		}
		
//		System.out.println(k);
	}

}
