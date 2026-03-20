package com.codegnan.collectionsframework.stack;

import java.util.Scanner;

/**
 * Demo for ToDo with Undo feature.
 */
public class ToDoUndoDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ToDoWithUndo todo = new ToDoWithUndo();

		boolean running = true;

		while (running) {
			System.out.println("\n===== TODO WITH UNDO =====");
			System.out.println("Tasks: " + todo.getTaskCount() + " | Undo available: " + todo.getUndoCount());

			displayTasks(todo);

			System.out.println("\n1. Add Task");
			System.out.println("2. Delete Task");
			System.out.println("3. Complete Task");
			System.out.println("4. Mark Incomplete");
			System.out.println("5. Undo Last Operation");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Clear buffer

			if (choice == 1) {
				System.out.print("Enter task description: ");
				String desc = scanner.nextLine();
				try {
					todo.addTask(desc);
					System.out.println("✓ Task added");
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}

			} else {
				if (choice == 2) {
					System.out.print("Enter task number to delete: ");
					int index = scanner.nextInt() - 1;
					try {
						todo.deleteTask(index);
						System.out.println("✓ Task deleted");
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Error: Invalid task number");
					}

				} else {
					if (choice == 3) {
						System.out.print("Enter task number to complete: ");
						int index = scanner.nextInt() - 1;
						try {
							todo.completeTask(index);
							System.out.println("✓ Task marked as completed");
						} catch (IndexOutOfBoundsException e) {
							System.out.println("Error: Invalid task number");
						}

					} else {
						if (choice == 4) {
							System.out.print("Enter task number to mark incomplete: ");
							int index = scanner.nextInt() - 1;
							try {
								todo.incompleteTask(index);
								System.out.println("✓ Task marked as incomplete");
							} catch (IndexOutOfBoundsException e) {
								System.out.println("Error: Invalid task number");
							}

						} else {
							if (choice == 5) {
								if (todo.undo()) {
									System.out.println("✓ Last operation undone");
								} else {
									System.out.println("Nothing to undo");
								}

							} else {
								if (choice == 6) {
									running = false;
									System.out.println("Goodbye!");
								} else {
									System.out.println("Invalid choice");
								}
							}
						}
					}
				}
			}
		}

		scanner.close();
	}

	private static void displayTasks(ToDoWithUndo todo) {
		if (todo.getTaskCount() == 0) {
			System.out.println("\nNo tasks.");
		} else {
			System.out.println("\nCurrent Tasks:");
			System.out.println("=".repeat(40));
			int i = 1;
			for (ToDoWithUndo.Task task : todo.getAllTasks()) {
				System.out.println(i++ + ". " + task);
			}
			System.out.println("=".repeat(40));
		}
	}
}
