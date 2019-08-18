package com.test.checkout;

import java.util.Objects;

public class Item {

  private String sku;

  public Item() {
    //Unused
  }

  public Item(String sku) {
    this.sku = sku;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Item)) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(getSku(), item.getSku());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getSku());
  }

  public String getSku() {
    return sku;
  }
}
