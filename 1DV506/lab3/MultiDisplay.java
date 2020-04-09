package ol222es_lab3;

public class MultiDisplay {

	private String displayMessage = "";
	private int displayCount = 0;
	
	public String getDisplayMessage() {
		return displayMessage;
	}
	
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}
	
	public int getDisplayCount() {		//In case we want to get current count
		return displayCount;
	}
	
	public void setDisplayCount(int displayCount) {
		
		if (check(displayCount)) {
			this.displayCount = displayCount;
		}
	}
	
	public void display() {
		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}
	
	public void display(String message, int counter) {
		if (check(counter)) {
			setDisplayMessage(message);
			for (int i = 0; i < counter; i++) {
				System.out.println(message);
			}
		}
	}
	
	private boolean check(int value) {
		
		if (value < 0) {
			System.out.println("Värdet måste vara större än 0");
			return false;
		}
		return true;
	}
}
