package com.test.checkout;

import java.util.HashMap;
import java.util.Map;

/**
 * List of rules
 */
public class PricingRules {

  private Map<Item, PricingRule> pricingRules;

  public static Map<Item, PricingRule> getCurrentPricingRules() {

    HashMap<Item, PricingRule> itemPricingRuleMap = new HashMap<Item, PricingRule>();

    itemPricingRuleMap.put(new Item("A"), new PricingRule(50, 3, 130));
    itemPricingRuleMap.put(new Item("B"), new PricingRule(30, 2, 45));
    itemPricingRuleMap.put(new Item("C"), new PricingRule(20, 0, 0));
    itemPricingRuleMap.put(new Item("D"), new PricingRule(15, 0, 0));

    return itemPricingRuleMap;
  }
}
