package MindGame;

import java.util.Stack;

public class LabCollectionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		stack.push("VP"); //Method Push
		stack.push("HB");
		stack.push("RK");
		stack.push("Vijay");
		System.out.println(stack);
		System.out.println("TOP: " + stack.peek());
		System.out.println("POOP: " + stack.pop()); //pop remove the head
		System.out.println(stack);
		stack.push("Raman");
		System.out.println(stack);

	}

}
