package com.test.checkout;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ItemListTest {

  private Set<String> testItemList;

  @Before
  public void setUp() {

    testItemList = new HashSet<String>(Arrays.asList("A", "B", "C", "D"));
  }

  @Test
  public void test_getList() {

    assertEquals(testItemList, ItemList.getList());
  }

  @Test
  public void test_toItemListString() {

    assertEquals("[A, B, C, D]", ItemList.toItemListString());
  }
}