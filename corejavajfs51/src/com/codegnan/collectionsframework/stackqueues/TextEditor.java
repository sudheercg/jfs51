package com.codegnan.collectionsframework.stackqueues;

import java.util.Stack;

public class TextEditor {

	Stack<String> stack = new Stack<>();
	String text = "";

	// type - METHOD TO TYPE TEXT

	public void type(String str) {
		text = text + str;
		stack.push(text);
		System.out.println("Typed: " + text);
	}

	// undo - METHOD TO UNDO LAST OPERATION
	public void undo() {
		if (!stack.isEmpty()) {
			stack.pop();// remove the top element/ last operation
			if (!stack.isEmpty()) {
				text = stack.peek();
			} else {
				text = "";
			}

		}
		System.out.println("After undo operation: " + text);

	}

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.type("A");
		editor.type("B");
		editor.type("C");
		
		editor.undo();
		editor.undo();
		
		editor.undo();
		
		
		
		
		

	}

}
