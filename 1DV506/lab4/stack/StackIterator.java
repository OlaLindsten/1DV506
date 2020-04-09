package ol222es_lab4.stack;

import java.util.Iterator;

public class StackIterator implements Iterator<Object> {

	private int nextValue = 0;
	private final Object [] values;
	private final int max;
	
	public StackIterator(Object[] values, int size) {
		this.values = values;
		this.max = size; 
	}
	
	public boolean hasNext() {
		
		if (nextValue < max) {
			return true;
		}

		return false;
	}

	public Object next() {

		return values[nextValue++];
	}

}
