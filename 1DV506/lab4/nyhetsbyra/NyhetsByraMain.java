package ol222es_lab4.nyhetsbyra;

public class NyhetsByraMain {

	public static void main(String[] args) {
		
		Tidning aftonbladet = new Tidning();					//Create three different papers
		Tidning dagensNyheter = new Tidning();
		Tidning expressen = new Tidning();
		
		NyhetsByra sverigesNyheter = new NyhetsByra();			//Create a news agency
		
		sverigesNyheter.registerNewspaper(aftonbladet);			//Register a newspaper
		sverigesNyheter.registerNewspaper(dagensNyheter);
		sverigesNyheter.registerNewspaper(expressen);
		
		//Add a couple of news		
		aftonbladet.addNews("Lorem Ipsum - All the facts - Lipsum generator.");	
		dagensNyheter.addNews("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur mi eget lorem accumsan convallis.");
		dagensNyheter.addNews("Suspendisse varius magna eget fermentum egestas. Nunc sem tortor, rutrum vulputate augue at, blandit condimentum libero.");
		aftonbladet.addNews("Nunc nec nisl ullamcorper, mollis lorem ac, tincidunt odio.");
		expressen.addNews("Phasellus vitae euismod felis.");
						
		sverigesNyheter.shareNews();							//Share the news within the agency

		//Add a couple of more news
		expressen.addNews("Quisque imperdiet enim a consequat bibendum.");
		dagensNyheter.addNews("Donec magna elit, ultrices nec enim imperdiet, sagittis semper nunc.");
		
		sverigesNyheter.shareNews();
		
		System.out.println("Tillagda nyheter:\n");
		for (int i = 0; i < aftonbladet.size(); i++) {			//Print all the news from aftonbladet
			System.out.println(aftonbladet.getNews(i));
		}
	}

}
