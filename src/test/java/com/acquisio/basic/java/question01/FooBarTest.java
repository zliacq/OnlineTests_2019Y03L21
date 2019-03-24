package com.acquisio.basic.java.question01;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarTest {

    @Test
    public void testFooBar1() {
        assertEquals("Foo", new FooBar().fooBar(3));
    }

    @Test
    public void testFooBar2() {
        assertEquals("Bar", new FooBar().fooBar(10));
    }

}