package ol222es_lab3;

public class Pnr {

	private static String getFirstPart(String pnr) {
		
		String firstPart = "";
		
		firstPart = pnr.substring(0,6);
		return firstPart;
	}
	
	private static String getSecondPart(String pnr) {
		
		String lastPart = "";
		
		lastPart = pnr.substring(7,11);
		return lastPart;
	}
	
	private static boolean isFemaleNumber(String pnr) {
		
		char femalePnr;
		
		femalePnr = pnr.charAt(9);
		
		if (femalePnr % 2 == 0) {
			return true;
		}
		return false;
	}
	
	private static boolean isMaleNumber (String pnr) {
			
		char malePnr;
			
		malePnr = pnr.charAt(9);
		
		if (malePnr % 2 == 1) {
			return true;
		}
		return false;
	}
	
	private static boolean areEqual(String pnr1, String pnr2) {
		
		return pnr1 == pnr2;
	}
	
	private static boolean isCorrect(String pnr) {			
		
		String year = "", month = "", date = ""; 
		
		String first = getFirstPart(pnr);
		String last = getSecondPart(pnr);
		
		String total = first + last;
		
		if (!isValidControlNumber(total)) {
			return false;
		}
		
		//Should be surrounded with try - catch block in case of failure when parsing string to int.
		year = pnr.substring(0, 2);
		int year2 = Integer.parseInt(year);
		
		month = pnr.substring(2,4);
		int month2 = Integer.parseInt(month);
				
		date = pnr.substring(4,6);
		int date2 = Integer.parseInt(date);
				
		if (isValidBirthday(year2, month2, date2)) {
			return true;
		}
		return false;
	}
	
	private static boolean isValidBirthday(int year, int month, int date) {
		
		if (year >= 0 && year <= 17 || year >= 47 && year <= 99) {	//Started counting from 1947 according to wikipedia
		
			if (month >= 1 && month <= 12) {
				
				if (!(month % 2 == 0) && month != 2 && date >= 1 && date <= 31) {
					return true;
				}else if ((month % 2 == 0) && month != 2 && date >= 1 && date <= 30) {
					return true;
				}else if (month == 2 && (month % 4 == 0) && date >= 1 && date <= 29) {		//Check if it is a leap year
					return true;
				}else if(month == 2 && date >= 1 && date <= 28) {
					return true;
				}
			}
		}
		return false;
	}
		
	private static boolean isValidControlNumber(String total) {
		
		int amount = 0;
		int inTotal = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		
		for (int i = 1; i < total.length(); i++) {
			char charTemp = total.charAt(i - 1);
			
			int intTemp = Integer.parseInt(Character.toString(charTemp));
						
			if (i % 2 == 0) {								//Take every other number
				amount = intTemp;
			}else if(i % 2 == 1) {
				amount = intTemp * 2;						
				if (amount >= 10 ) {						//Exampel if the number is 15 take 1 + 5
					firstNumber = amount / 10;
					secondNumber = amount % 10;
					amount = secondNumber + firstNumber;
				}
			}
			inTotal = inTotal + amount;
			amount = 0;
			secondNumber = 0;
		}
		
		String controlNumber = total.substring(9);
		int controlNumber2 = Integer.parseInt(controlNumber);
		if ((10 - (inTotal % 10)) % 10 == controlNumber2) {			//Luhns algoritm, från wikipedia
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		String pnr1 = "811218-9876";		//Ett ok personnummer, från wikipedia
		String pnr2 = "911410-9536";
		
		System.out.println("Första delen: " + getFirstPart(pnr1));
		System.out.println("Andra delen: " + getSecondPart(pnr1));
		
		System.out.println("Feminint personnummer: " + isFemaleNumber(pnr2));
		System.out.println("Maskulint personummer: " + isMaleNumber(pnr1));
		
		System.out.println("Är personnummrerna lika: " + areEqual(pnr1, pnr2));
		
		if (isCorrect(pnr1)) {
			System.out.println("Personnumret: " + pnr1 + " är giltligt");
		}else {
			System.out.println("Personnumret: " + pnr1 + " är inte giltligt");
		}
		
	}

}
