package com.acquisio.basic.java.question05;

import static org.junit.Assert.*;

import org.junit.Test;

public class RefactoringTest {

    @Test
    public void testName() {
        Item[] items = new Item[] {new Item("foo", 0, 0)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    @Test
    public void agedBrieItem_WhenUpdateQuality_ThenSellInOrQualityUpdated() {
        Item[] items = new Item[] {new Item("Aged Brie", 10, 30)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(31, app.items[0].quality);
    }
    @Test
    public void backstagePassesItemWithZeroSellIn_WhenUpdateQuality_ThenSellInOrQualityUpdated() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
    @Test
    public void backstagePassesItemWithSellInIsTwelve_WhenUpdateQuality_ThenQualityIncreasedByTwo() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 12, 30)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(31, app.items[0].quality);
    }
    @Test
    public void backstagePassesItemWithSellInIsEleven_WhenUpdateQuality_ThenQualityIncreasedByTwo() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 11, 30)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(32, app.items[0].quality);
    }
    @Test
    public void backstagePassesItemWithSellInIsFive_WhenUpdateQuality_ThenQualityIncreasedByThree() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(33, app.items[0].quality);
    }
    @Test
    public void ConjuredItem_WhenUpdateQuality_ThenQualityDegradedByTwo() {
        Item[] items = new Item[] {new Item("Conjured", 4, 20)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Conjured", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
    }
    @Test
    public void legendaryItem_WhenUpdateQuality_ThenNoSellInOrQualityChanged() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

}