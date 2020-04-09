package ol222es_lab4.stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		
		Stack stack = new StackMethods();				
		
		
		System.out.println("Curent size: " + stack.size());
		
		System.out.println("Is stack empty: " + stack.isEmpty());
		
		stack.push(1);
		stack.push("text");
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
	
		stack.push("text");
		
		System.out.println("The object on top: " + stack.peek());

		System.out.println("Removing: " + stack.pop());
		
		System.out.println("Curent size: " + stack.size());
		
		Iterator<Object> it = stack.iterator();								
		
		while (it.hasNext()) {
			Object temp = it.next();
			System.out.println(temp);
		} 
		
	}

}
