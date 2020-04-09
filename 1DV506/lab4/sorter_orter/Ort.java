package ol222es_lab4.sorter_orter;

public class Ort implements Comparable<Ort>{

	private int postkod = 0;
	private String ort = "";
	
	public int getPostkod() {
		return postkod;
	}

	public void setPostkod(int postkod) {
		this.postkod = postkod;
	}
	
	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public Ort(int postkod, String ort) {
		this.postkod = postkod;
		this.ort = ort;
	}
	
	public String toString() {
		return this.postkod + " " + this.ort; 
	}
	
	public int compareTo(Ort o) {

		if (o.postkod > this.postkod) {
			return -1;
		}else if(o.postkod < postkod) {
			return 1;
		}else {						//equal
			return 0;
		}
		
	}

	
}
