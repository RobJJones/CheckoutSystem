package com.test.checkout;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

  public Item item;

  @Before
  public void setUp(){
    item = new Item("A");
  }

  @Test
  public void test_equals() {

    Item item2 = new Item("A");
    Item item3 = new Item("B");

    assertEquals(item, item2);
    assertNotEquals(item, item3);
  }

  @Test
  public void test_hashCode() {

    assertEquals(96, item.hashCode());
  }

  @Test
  public void test_getSku() {

    assertEquals("A", item.getSku());
  }
}