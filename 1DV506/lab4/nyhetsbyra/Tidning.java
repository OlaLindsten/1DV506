package ol222es_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Tidning {

	private ArrayList<String> news = new ArrayList<String>();		//Store the news

	public void addNews(String news) {				//Add a piece of news
		this.news.add(news);
	}
	
	public String getNews(int index) {				//Return a piece of news
		return news.get(index);
	}
	
	public int size() {								//Get current amount of news
		return news.size();
	}
	
	public boolean isEmpty() {						//Returns true if there isn't any news
		return news.isEmpty();
	}

	public void removeNews(int index) {				//Remove a news item
		news.remove(index);
	}
}
