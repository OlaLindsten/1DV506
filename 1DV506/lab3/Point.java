package ol222es_lab3;

public class Point {

	
	private int x = 0;
	private int y = 0; 

	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {

		return "(" + x + "," + y + ")";
	}

	public boolean isEqualTo(Point pIn) {
		
		if (this.x == pIn.x && this.y == pIn.y) {
			return true;
		}
		
		return false;
	}

	public double distanceTo(Point pIn) {

		double distance = 0;
		
	    distance = Math.sqrt(Math.pow(this.x - pIn.x, 2) + Math.pow(this.y - pIn.y, 2));
	    
		return distance;
	}

	public void move(int i, int j) {
		
		this.x = this.x + i;
		this.y = this.y + j;
	}

	public void moveToXY(int i, int j) {
		
		this.x = i;
		this.y = j;
	}
	
}
