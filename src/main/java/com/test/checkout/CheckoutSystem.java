package com.test.checkout;

import java.util.Scanner;

/**
 * CheckoutSystem
 *
 * Supermarket checkout that calculates the total price of a number of items.
 */
public class CheckoutSystem {

  public static void main(String[] args) {

    CustomerOrder customerOrder = new CustomerOrder();

    System.out.println("Welcome to the Checkout!");
    System.out.printf("Please enter a SKU %s of an item and return to add an item, and return only to end:\n",
      ItemList.toItemListString());
    Scanner scanner = new Scanner(System.in);

    String nextSKU = scanner.nextLine();

    while (!nextSKU.isEmpty()) {

        if (ItemList.getList().contains(nextSKU)) {
          final Item item = new Item(nextSKU);
          customerOrder.add(item);
          System.out.printf("Running total: %d\n", customerOrder.calculateTotal());

        } else {
          System.out.printf("Unknown item - %s\n", nextSKU);
        }

      nextSKU = scanner.nextLine();
    }

    System.out.printf("\n\nFinal Total: %d\n", customerOrder.calculateTotal());
    scanner.close();
  }

}
