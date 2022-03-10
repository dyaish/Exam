
public class Q1 {

	public int getMaxRevenue(int[] ratesPrices) {
		int max = ratesPrices[0], min = ratesPrices[0];
		int revenue = 0;

		for (int i = 0; i < ratesPrices.length; i++) {

			if (ratesPrices[i] < min) {
				min = ratesPrices[i];
			} else if (ratesPrices[i] > max) {
				max = ratesPrices[i];
			}
		}
		revenue = max - min;
		System.out.println("revenue is " + revenue);
		return revenue;
	}

	public static void main(String[] args) {
		Q1 q = new Q1();
		int[] array = { 5, 4, 9, 2, 8, 7, 7, 9, 6, 8 };
		q.getMaxRevenue(array);

	}
}
