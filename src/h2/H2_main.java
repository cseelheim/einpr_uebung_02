package h2;

public class H2_main {

	public static void main(String[] args) {
		int i, j, k, min, max;
		i = 5;
		j = 76;
		k = 1;
		min = 45;
		max = 34;

		min = i;
		if (min > j) {
			min = j;
		}

		if (min > k) {
			min = k;
		}

		max = i;
		if (max < j) {
			max = j;
		}

		if (max < k) {
			max = k;
		}

	}

}
