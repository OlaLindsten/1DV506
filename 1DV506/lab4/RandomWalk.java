package ol222es_lab4;

import java.util.Random;

public class RandomWalk {

	private int x = 0;				//Current x-coordinate
	private int y = 0;				//Current x-coordinate
	private int max = 0;			//Max steps for a run
	private int stepsTaken = 0;		//Amount of steps taken
	private int playField = 0;			//Size of the field
	private Random rand = new Random();

	
	public RandomWalk(int max, int size) {
		this.max = max;
		this.playField = size;
	}

	public String toString() {
		return "Steps taken: " + stepsTaken + ", current position: " + "(" + x +"," + y + ")";
	}
	
	public void takeStep() {
		
		switch (rand.nextInt(4)) {
		case 0:					//y+	up	
			y++;
			break;
		case 1:					//y-	down
			y--;
			break;
		case 2:					//x+	right
			x++;
			break;
		case 3: 				//x-	left
			x--;
			break;
		}
		stepsTaken++;
	}
	
	public boolean moreSteps() {
		return stepsTaken < max; 		//Return true if steps is less than max
	}
	
	public boolean inBounds() {
		return x <= playField && y <= playField && x >= -playField && y >= -playField;		//Return true if current position is whitin the playing field
	}
	
	public void walk() {
		
		while(inBounds() && moreSteps()) {
			takeStep();
		}
	}
}
