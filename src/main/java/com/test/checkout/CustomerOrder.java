package com.test.checkout;

import java.util.ArrayList;

/**
 * CustomerOrder
 *
 * Stores a customer's order and calculates the total
 */
public class CustomerOrder {

  private ArrayList<Item> items = new ArrayList<Item>();

  public void add(Item item) {
    items.add(item);
  }

  /**
   * Calculates a customer's total based on Items the have purchased
   *
   * @return Calculated total
   */
  public long calculateTotal() {

    long total = 0;

    for (final String itemSKU : ItemList.getList()) {
      Item item = new Item(itemSKU);
      final long count = items.stream().filter(streamItem -> streamItem.getSku().equals(itemSKU)).count();
      final PricingRule pricingRule = PricingRules.getCurrentPricingRules().get(item);

      final int specialPrice = pricingRule.getSpecialPrice();
      final int specialQty = pricingRule.getSpecialQty();
      final int unitPrice = pricingRule.getUnitPrice();

      if (count>0) {
        if (specialQty>0) {
          total += getStandardPriceTotal(count % specialQty, unitPrice);
          total += getSpecialPriceTotal(count, specialQty, specialPrice);
        } else {
          total += getStandardPriceTotal(count, unitPrice);
        }
      }
    }

    return total;
  }

  /**
   * @param qty - The Quantity of items
   * @param price - The prices of an item
   * @return calculated price
   */
  protected long getStandardPriceTotal(long qty, int price) {

    return qty*price;
  }

  /**
   * @param allItemCount - The total count of items
   * @param specialQuantity   - The number of items required for the special price
   * @param specialPrice - The special price of a set of items
   * @return calculated price
   */
  protected long getSpecialPriceTotal(long allItemCount, int specialQuantity, int specialPrice) {

    return (allItemCount/specialQuantity)*specialPrice;
  }
}
