package com.codegnan.collectionsframework.stack;
import java.util.ArrayList;

/**
 * Enhanced ToDo application with Undo functionality.
 */
public class ToDoWithUndo {
    
    /**
     * Operation class for undo tracking.
     */
    private static class Operation {
        String type;  // "ADD", "DELETE", "COMPLETE", "INCOMPLETE"
        Task task;
        int index;
        
        public Operation(String type, Task task, int index) {
            this.type = type;
            this.task = task;
            this.index = index;
        }
    }
    
    /**
     * Task class.
     */
    public static class Task {
        private String description;
        private boolean completed;
        
        public Task(String description) {
            this.description = description;
            this.completed = false;
        }
        
        public String getDescription() {
            return description;
        }
        
        public boolean isCompleted() {
            return completed;
        }
        
        public void setCompleted(boolean completed) {
            this.completed = completed;
        }
        
        @Override
        public String toString() {
            if (completed) {
                return "[✓] " + description;
            } else {
                return "[ ] " + description;
            }
        }
    }
    
    private ArrayList<Task> tasks;
    private Stack<Operation> undoStack;
    
    public ToDoWithUndo() {
        tasks = new ArrayList<Task>();
        undoStack = new Stack<Operation>();
    }
    
    /**
     * Add new task.
     */
    public void addTask(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        } else {
            Task task = new Task(description.trim());
            tasks.add(task);
            
            // Record operation for undo
            undoStack.push(new Operation("ADD", task, tasks.size() - 1));
        }
    }
    
    /**
     * Delete task.
     */
    public void deleteTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid task index");
        } else {
            Task task = tasks.get(index);
            tasks.remove(index);
            
            // Record operation for undo
            undoStack.push(new Operation("DELETE", task, index));
        }
    }
    
    /**
     * Mark task as completed.
     */
    public void completeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid task index");
        } else {
            Task task = tasks.get(index);
            task.setCompleted(true);
            
            // Record operation for undo
            undoStack.push(new Operation("COMPLETE", task, index));
        }
    }
    
    /**
     * Mark task as incomplete.
     */
    public void incompleteTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid task index");
        } else {
            Task task = tasks.get(index);
            task.setCompleted(false);
            
            // Record operation for undo
            undoStack.push(new Operation("INCOMPLETE", task, index));
        }
    }
    
    /**
     * Undo last operation.
     * @return true if undo successful, false if nothing to undo
     */
    public boolean undo() {
        if (undoStack.isEmpty()) {
            return false;
        } else {
            Operation op = undoStack.pop();
            
            if (op.type.equals("ADD")) {
                // Undo add: remove the task
                tasks.remove(op.index);
                
            } else {
                if (op.type.equals("DELETE")) {
                    // Undo delete: add task back
                    tasks.add(op.index, op.task);
                    
                } else {
                    if (op.type.equals("COMPLETE")) {
                        // Undo complete: mark as incomplete
                        op.task.setCompleted(false);
                        
                    } else {
                        if (op.type.equals("INCOMPLETE")) {
                            // Undo incomplete: mark as complete
                            op.task.setCompleted(true);
                        } else {
                            // unknown operation
                        }
                    }
                }
            }
            
            return true;
        }
    }
    
    /**
     * Get all tasks.
     */
    public ArrayList<Task> getAllTasks() {
        return new ArrayList<Task>(tasks);
    }
    
    /**
     * Get task count.
     */
    public int getTaskCount() {
        return tasks.size();
    }
    
    /**
     * Check if undo is available.
     */
    public boolean canUndo() {
        if (undoStack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Get number of operations that can be undone.
     */
    public int getUndoCount() {
        return undoStack.size();
    }
}
