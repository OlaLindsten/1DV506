package ol222es_lab3;

public class Fraction {

	private int numerator = 0;
	private int denominator = 0;
	
	public Fraction(int numerator, int denominator){			//I Don't know if it is allowed to be zero here but i choose to let it.
		this.numerator = numerator;		
		this.denominator = denominator;	
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public Fraction add(Fraction frac) {
		
		if (isZero(this.denominator) && isZero(frac.denominator)) {
					
			int totalN = 0;
			int totalD = 0;
			int num1 = 0;
			int num2 = 0;
						
			totalD = this.denominator * frac.denominator; 
				
			num1 = frac.denominator * this.numerator;
			num2 = this.denominator * frac.numerator;
				
			totalN = num1 + num2;
				
			if (isNegative(totalD, totalN)) {
				totalD = totalD * -1;
				totalN = totalN * -1;
			}
			
			int lowestDivider = euklides(totalN, totalD);
			totalN = totalN / lowestDivider;
			totalD = totalD / lowestDivider;

			return new Fraction(totalN, totalD);
			
		}else if(!isZero(this.denominator)) {
			return new Fraction(frac.numerator, frac.denominator);
		}else {
			return new Fraction(this.numerator, this.denominator);
		}
	}
	
	public Fraction subtract(Fraction frac) {
		
		if (isZero(this.denominator) && isZero(frac.denominator)) {
			
			int totalN = 0;
			int totalD = 0;
			int num1 = 0;
			int num2 = 0;
					
			totalD = this.denominator * frac.denominator; 
			
			num1 = frac.denominator * this.numerator;
			num2 = this.denominator * frac.numerator;
			
			totalN = num1 - num2;
			
			if (isNegative(totalD, totalN)) {
				totalD = totalD * -1;
				totalN = totalN * -1;
			}
			
			int lowestDivider = euklides(totalN, totalD);
			totalN = totalN / lowestDivider;
			totalD = totalD / lowestDivider;
			
			return new Fraction(totalN, totalD);
			
		}else if(!isZero(this.denominator)) {
			return new Fraction(frac.numerator, frac.denominator);
		}else {
			return new Fraction(this.numerator, this.denominator);
		}
	}
	
	public Fraction multiply(Fraction frac) {
		
		if(isZero(this.denominator) && isZero(frac.denominator)) {
		
			int totalN = 0;
			int totalD = 0;
						
			totalN = this.numerator * frac.numerator;
			totalD = this.denominator * frac.denominator;
			
			if (isNegative(totalN, totalD)) {
				totalN = totalN * -1;
				totalD = totalD * -1;
			}
						
				int lowestDivider = euklides(totalN, totalD);
				totalN = totalN / lowestDivider;
				totalD = totalD / lowestDivider;
			
			return new Fraction(totalN, totalD);
			
		}else if(!isZero(this.denominator)) {
			return new Fraction(frac.numerator, frac.denominator);
		}else {
			return new Fraction(this.numerator, this.denominator);
		}
	}
	
	public Fraction divide(Fraction frac) {
		
		if (isZero(this.denominator) &&  isZero(frac.denominator)) {
		
			int totalN = 0;
			int totalD = 0;
			
			totalN = this.numerator * frac.denominator;
			totalD = frac.numerator * this.denominator;
							
			if (isNegative(totalN, totalD)) {
				totalN = totalN * -1;
				totalD = totalD * -1;
			}
			
			int lowestDivider = euklides(totalN, totalD);
			totalN = totalN / lowestDivider;
			totalD = totalD / lowestDivider;
			
			return new Fraction(totalN, totalD);
			
		}else if(!isZero(this.denominator)) {
			return new Fraction(frac.numerator, frac.denominator);
		}else {
			return new Fraction(this.numerator, this.denominator);
		}
	}
	
	public boolean isEqualTo(Fraction frac) {
		return this.numerator == frac.numerator && this.denominator == frac.denominator;
	}
	
	public boolean isNegative() {	
		if (this.numerator < 0 || this.denominator < 0) {
			return true;
		}
		return false; 
	}
	
	private int euklides(int a, int b) {		//Euklides algoritm, med hjälp av wikipedia
					
		int c = 0;
		while(b != 0) {		
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
	
	private boolean isNegative(int numerator, int denominator) {
		if (numerator < 0 && denominator < 0) {
			return true;
		}
		return false; 
	}
	
	private boolean isZero(int denominator) {
		if(!(denominator == 0)) {
			return true;
		}
		return false;
	}
}
