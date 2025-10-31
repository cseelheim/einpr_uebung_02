package h3;

public class H3_main {

	public static void main(String[] args) {
		int i, j, k;
		i = 34;
		j = 12;
		k = -10;
		
		boolean ausdruck1, ausdruck2, ausdruck3;
		ausdruck1 = i > j;
		ausdruck2 = i > 200;
		ausdruck3 = j > 100;



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
