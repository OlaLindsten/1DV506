package ol222es_lab4.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

public class StackMethods implements Stack {

	private int top = 5;
	private int size = -1;
	private Object[] values = new Object[top];	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size == -1) {
			return true;
		}
		return false;
	}
	
	public void push(Object element) {
		size++;

		if (size == top) {
			resize();
			values[size] = element;
			
		}else {
			values[size] = element;
		}
	}
	
	public Object pop() {
		if (!isEmpty()) {
			Object temp = values[size];
			values[size] = null;
			size--;
			return temp;
		}else {
			throw new EmptyStackException();
		}
	}

	public Object peek() {
		if(!isEmpty()) {
			return values[size];
		}else {
			throw new EmptyStackException();
		}
	}

	public Iterator<Object> iterator(){
		
		return new StackIterator(values , size);	
	}
	
	private void resize() {
		top = top * 2;
		
		Object[] temp = new Object[top];

		for (int i = 0; i < size; i++) {
			temp[i] = values[i];
		}
		values = temp;
		System.out.println("--Making the array twice as large--");
	}
}
