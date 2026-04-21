package com.codegnan.collectionsframework.stackqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoDemo {
	
	public static void main(String[] args) {
		
		Deque<String>  undoStack = new ArrayDeque<>();
		Deque<String>  redoStack= new ArrayDeque<>();
		
		undoStack.push("Type A");
		undoStack.push("Type B");
		undoStack.push("Type C");
		
		System.out.println("Undo Stack "+ undoStack);
		
		//UNDO operation
		String action = undoStack.pop();
		redoStack.push(action);
		
		System.out.println("After undo: "+undoStack);
		
		//Redo
		action= redoStack.pop();
		undoStack.push(action);
		
		System.out.println("After Redo operation: "+undoStack);
		
			
	}

}
