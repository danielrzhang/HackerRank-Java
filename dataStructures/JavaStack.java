package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Character> stack;
		
		String input;
		char ch;
		while (in.hasNext()) {
			input = in.nextLine();
			
			stack = new Stack<Character>();
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				
				if (stack.isEmpty()) {
					stack.push(ch);
				} else if (stack.peek() == '{' && ch == '}') {
					stack.pop();
				} else if (stack.peek() == '(' && ch == ')') {
					stack.pop();
				} else if (stack.peek() == '[' && ch == ']') {
					stack.pop();
				} else {
					stack.push(ch);
				}
			}
			System.out.println(stack.isEmpty());
		}
		in.close();
	}

}
