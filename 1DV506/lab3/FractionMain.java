package ol222es_lab3;

public class FractionMain {

	public static void main(String[] args) {
		
		Fraction frac = new Fraction(-8, 8);
		Fraction frac2 = new Fraction(-8, 4);
		
		System.out.println("Br�ktal: " + frac.toString());
		
		System.out.println("T�ljare: " + frac.getNumerator());
		System.out.println("N�mnare: " + frac.getDenominator());

		System.out.println("�r br�ket negativt: " + frac.isNegative());

		System.out.println("Addition: " + frac.add(frac2));
		
		System.out.println("Subtraktion: " + frac.subtract(frac2));
		
		System.out.println("Muliplikation: " + frac.multiply(frac2));
		
		System.out.println("Division: " + frac.divide(frac2));
		
		System.out.println("�r talen lika: " + frac.isEqualTo(frac2));
	}

}
