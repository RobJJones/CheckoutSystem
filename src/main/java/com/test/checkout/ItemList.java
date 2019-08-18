package com.test.checkout;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ItemList {

  private static Set<String> itemList = new HashSet<String>(Arrays.asList("A", "B", "C", "D"));

  public static Set<String> getList() {
    return itemList;
  }

  public static String toItemListString() {
    return Arrays.toString(itemList.toArray());
  }

}
