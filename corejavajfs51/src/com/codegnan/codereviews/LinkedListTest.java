package com.codegnan.codereviews;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Comprehensive tests for LinkedList.
 */
public class LinkedListTest {
    
    private LinkedList<Integer> list;
    
    @BeforeEach
    public void setUp() {
        list = new LinkedList<Integer>();
    }
    
    // ===== ADD TESTS =====
    
    @Test
    public void testAddFirst_EmptyList() {
        list.addFirst(10);
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));
    }
    
    @Test
    public void testAddFirst_NonEmptyList() {
        list.addLast(20);
        list.addFirst(10);
        
        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }
    
    @Test
    public void testAddLast_EmptyList() {
        list.addLast(10);
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));
    }
    
    @Test
    public void testAddLast_NonEmptyList() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        assertEquals(3, list.size());
        assertEquals(10, list.get(0));
        assertEquals(30, list.get(2));
    }
    
    @Test
    public void testAdd_AtBeginning() {
        list.addLast(20);
        list.add(0, 10);
        
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }
    
    @Test
    public void testAdd_AtMiddle() {
        list.addLast(10);
        list.addLast(30);
        list.add(1, 20);
        
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }
    
    @Test
    public void testAdd_InvalidIndex_ThrowsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(5, 10);
        });
    }
    
    // ===== REMOVE TESTS =====
    
    @Test
    public void testRemoveFirst_SingleElement() {
        list.addLast(10);
        int removed = list.removeFirst();
        
        assertEquals(10, removed);
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testRemoveFirst_MultipleElements() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        int removed = list.removeFirst();
        
        assertEquals(10, removed);
        assertEquals(2, list.size());
        assertEquals(20, list.get(0));
    }
    
    @Test
    public void testRemoveFirst_EmptyList_ThrowsException() {
        assertThrows(IllegalStateException.class, () -> {
            list.removeFirst();
        });
    }
    
    @Test
    public void testRemoveLast_SingleElement() {
        list.addLast(10);
        int removed = list.removeLast();
        
        assertEquals(10, removed);
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testRemoveLast_MultipleElements() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        int removed = list.removeLast();
        
        assertEquals(30, removed);
        assertEquals(2, list.size());
    }
    
    @Test
    public void testRemove_ByIndex() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        int removed = list.remove(1);
        
        assertEquals(20, removed);
        assertEquals(2, list.size());
        assertEquals(30, list.get(1));
    }
    
    // ===== ACCESS TESTS =====
    
    @Test
    public void testGet_ValidIndex() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }
    
    @Test
    public void testGet_InvalidIndex_ThrowsException() {
        list.addLast(10);
        
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(5);
        });
    }
    
    @Test
    public void testIndexOf_ElementExists() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        assertEquals(1, list.indexOf(20));
    }
    
    @Test
    public void testIndexOf_ElementNotExists() {
        list.addLast(10);
        list.addLast(20);
        
        assertEquals(-1, list.indexOf(100));
    }
    
    @Test
    public void testContains_True() {
        list.addLast(10);
        list.addLast(20);
        
        assertTrue(list.contains(20));
    }
    
    @Test
    public void testContains_False() {
        list.addLast(10);
        
        assertFalse(list.contains(100));
    }
    
    // ===== UTILITY TESTS =====
    
    @Test
    public void testSize_EmptyList() {
        assertEquals(0, list.size());
    }
    
    @Test
    public void testSize_AfterOperations() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeFirst();
        
        assertEquals(2, list.size());
    }
    
    @Test
    public void testIsEmpty_NewList() {
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testIsEmpty_AfterAdd() {
        list.addLast(10);
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void testClear() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        list.clear();
        
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }
    
    @Test
    public void testReverse_EmptyList() {
        list.reversed();
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testReverse_SingleElement() {
        list.addLast(10);
        list.reversed();
        
        assertEquals(10, list.get(0));
    }
    
    @Test
    public void testReverse_MultipleElements() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        
        list.reversed();
        
        assertEquals(30, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(10, list.get(2));
    }
}
