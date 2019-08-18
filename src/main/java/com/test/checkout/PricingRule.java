package com.test.checkout;

public class PricingRule {

  private int unitPricePence;
  private int specialQty;
  private int specialPrice;

  public PricingRule(int unitPricePence, int specialQty, int specialPrice) {
    this.unitPricePence = unitPricePence;
    this.specialQty = specialQty;
    this.specialPrice = specialPrice;
  }

  public int getUnitPrice() {
    return unitPricePence;
  }

  public void setUnitPricePence(int unitPricePence) {
    this.unitPricePence = unitPricePence;
  }

  public int getSpecialQty() {
    return specialQty;
  }

  public void setSpecialQty(int specialQty) {
    this.specialQty = specialQty;
  }

  public int getSpecialPrice() {
    return specialPrice;
  }

  public void setSpecialPrice(int specialPrice) {
    this.specialPrice = specialPrice;
  }
}
