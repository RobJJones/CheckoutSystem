package com.test.checkout;

import org.junit.Before;

import static org.junit.Assert.*;

public class CustomerOrderTest {

  private CustomerOrder customerOrder;

  @Before
  public void setUp() {

    customerOrder = new CustomerOrder();
    customerOrder.add(new Item("A"));
    customerOrder.add(new Item("A"));
    customerOrder.add(new Item("B"));
    customerOrder.add(new Item("A"));
    customerOrder.add(new Item("D"));
    customerOrder.add(new Item("B"));
    customerOrder.add(new Item("A"));
    customerOrder.add(new Item("C"));
  }

  @org.junit.Test
  public void expect_CalculateTotalTwoSixty() {
    assertEquals(260, customerOrder.calculateTotal());
  }

  @org.junit.Test
  public void expect_StandardPriceTotalOneFifty() {
    assertEquals(1500, customerOrder.getStandardPriceTotal(10, 150));
  }

  @org.junit.Test
  public void expect_SpecialPriceTotalTwoHundred() {

    assertEquals(200, customerOrder.getSpecialPriceTotal(150, 35, 50));
  }
}