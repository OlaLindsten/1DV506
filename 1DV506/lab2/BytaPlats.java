package ol222es_lab2;

public class BytaPlats {

	public static void main(String[] args) {
				
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 
       			't', 't', 'e', 'D' };

		System.out.println(text);

		int textLength = text.length;

		for (int i = 1; i <= textLength/2; i++) {
			char temp = text[i - 1];
			text[i - 1] = text[textLength - i];
			text[textLength - i] = temp;
		}		
		
		for (int i = 0; i < textLength; i++) {
			System.out.print(text[i]);
		}
	}

}
