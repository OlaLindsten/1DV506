package ol222es_lab2;

public class TartLjus {

	public static void main(String[] args) {
		
		int totalBoxes = 0, boxesToBuy = 0, candels = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			while(candels < i && i <= 100) {
				totalBoxes++;
				boxesToBuy++;
				candels = candels + 24;
			}
			
			if (boxesToBuy > 0) {
				System.out.println("Before birthday " + i + " buy " + boxesToBuy + " box(es)");
			}
			
			boxesToBuy = 0;
			candels = candels - i;
		}				
		System.out.println("\nTotal number of boxes: " + totalBoxes + ", Remaining candels: " + candels);

	}

}
