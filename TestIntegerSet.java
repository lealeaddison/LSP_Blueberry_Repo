package org.howard.edu.lsp.assignment6;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TestIntegerSet {
    
    private IntegerSet set;
    
    @Before
    public void setUp() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        set = new IntegerSet(list);
    }
    
    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.clear();
        assertEquals(0, set.length());
    }
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, set.length());
    }
    
    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(1);
        IntegerSet set2 = new IntegerSet(list);
        assertTrue(set.equals(set2));
        list.add(2);
        set2 = new IntegerSet(list);
        assertFalse(set.equals(set2));
    }
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest1() throws IntegerSetException {
        assertEquals(5, set.largest());
    }
    
    @Test(expected = IntegerSetException.class)
    @DisplayName("Test case for largest exception")
    public void testLargestException() throws IntegerSetException {
        set.clear();
        set.largest();
    }
    
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        assertEquals(1, set.smallest());
    }
    
    @Test(expected = IntegerSetException.class)
    @DisplayName("Test case for smallest exception")
    public void testSmallestException() throws IntegerSetException {
        set.clear();
        set.smallest();
    }
    
    @Test
    @DisplayName("Test case for addItem")
    public void testAddItem() {
        set.add(2);
        assertEquals(4, set.length());
        assertTrue(set.contains(2));
        set.add(5);
        assertEquals(4, set.length());
    }
    
    @Test
    @DisplayName("Test case for removeItem")
    public void testRemoveItem() {
        set.remove(3);
        assertEquals(2, set.length());
        assertFalse(set.contains(3));
        set.remove(4);
        assertEquals(2, set.length());
    }
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
        
        set.union(set2);
        
        assertEquals(6, set.length());
        assertTrue(set.contains(2));
        assertTrue(set.contains(4));
        assertTrue(set.contains(6));
    }
    
    @Test
    @DisplayName("Test case for intersection")
    public void testIntersection() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        IntegerSet set2 = new IntegerSet(list);
        
        set.intersect(set2);
        
        assertEquals(2, set.length());
        assertTrue(set.contains(2));
        assertTrue(set.contains(4));
        assertTrue(set.contains(6));
    }

    @Test
    @DisplayName("Test case for empty intersection")
    public void testEmptyIntersection() {
ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        IntegerSet set2 = new IntegerSet(list);
        
        set.intersect(set2);
        
        assertEquals(0, set.length());
    }

    @Test
    @DisplayName("Test case for difference")
    public void testDifference() {
ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        IntegerSet set2 = new IntegerSet(list);
        
        set.diff(set2);
        
        assertEquals(1, set.length());
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));
        assertFalse(set.contains(5));
    }
    
    @Test
    @DisplayName("Test case for empty set")
    public void testIsEmpty() {
    	assertFalse(set.isEmpty());
    	set.clear();
    	assertTrue(set.isEmpty());
    }
}