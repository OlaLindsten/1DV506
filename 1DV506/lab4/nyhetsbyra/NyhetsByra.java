package ol222es_lab4.nyhetsbyra;

import java.util.ArrayList;

public class NyhetsByra {
	
	private ArrayList<Tidning> id = new ArrayList<Tidning>();			//Id for newspaper
	private ArrayList<String> news = new ArrayList<String>();			//Store the news to add to the different newspapers
	private ArrayList<Tidning> tempId = new ArrayList<Tidning>();		//Create a temporary arraylist to know who sent which paper
	
	private boolean exists = false;										//Boolean to check if the newspaper exists
	private int startValue = 0;											//Determines where the for loop should start counting from
	
	//Register a newspaper
	public void registerNewspaper(Tidning newsPaper) {
								
		if (this.id.size() == 0) {										//If arraylist is empty we can add it directly
			this.id.add(newsPaper);
		}else {
			for (int i = 0; i < this.id.size(); i++) {					//Loop through arraylist 
				if (this.id.get(i) == newsPaper) {						//Check if the newspaper already exist
					exists = true;										//Set it to true so we know it exists
				}
			}
			
			if (exists) {
				System.out.println("Tidningen existerar redan");
				exists = false;
			}
			this.id.add(newsPaper);
		}
		
	}

	//Loop through arraylist to know what to add and to which newspaper
	public void shareNews() {
				
		for (int i = 0; i < this.id.size(); i++) {							//Loops through all registered papers			
			for (int j = startValue; j < this.id.get(i).size(); j++) {		//Loops through the different news from the current registered paper, starts on the new news
				news.add(this.id.get(i).getNews(j));						//Add the news to an array that stores all news
				tempId.add(this.id.get(i));									//Add a temporary variable to know where it came from
			}
		}
		sendNews();															//Send the temporary arraylist to next method to add to the other papers
	}	
	
	//Add the news to the different newspapers
	private void sendNews() {
		
		for (Tidning tidning : id) {										//For each paper in the arraylist
			for (int i = startValue; i < news.size(); i++) {				//Loops through news arraylist
				if (!(tempId.get(i).equals(tidning))) {						//If id isn't the same as who added it 
					tidning.addNews(news.get(i));							//Add news the paper
				}
			}
		}
		startValue = news.size();											//Set the value of startValue to the last item in the array
	}
	
}
