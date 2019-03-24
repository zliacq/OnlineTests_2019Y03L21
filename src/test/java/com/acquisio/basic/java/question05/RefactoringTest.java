package com.acquisio.basic.java.question05;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefactoringTest {

    @Test
    public void testName() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void testName2() {
        Item[] items = new Item[]{new Item("foo", 10, 10),
                new Item("foo1", 4, 7), new Item("foo2", 6, 10)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo2", app.items[2].name);
    }

}