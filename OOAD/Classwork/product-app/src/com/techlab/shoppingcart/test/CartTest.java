package com.techlab.shoppingcart.test;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

import com.techlab.shoppingcart.*;

public class CartTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<Product> product = new ArrayList<Product>();
		HashMap<Customer, ArrayList<Product>> map = new HashMap<Customer, ArrayList<Product>>();

		boolean exitMain = false;
		final int ADD_NEW_CUSTOMER = 1, GET_CUSTOMERS = 2, EXIT_MAIN = 3;
//		final int  EXISITING_CUSTOMER = 2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter ur choice");
		System.out.println("1. Create new Customer." + "\n2. Print customer details." + "\n3. Exit");

		int mainChoice = scan.nextInt();

		do {
			switch (mainChoice) {

			case ADD_NEW_CUSTOMER:
				System.out.println("Enter Customer Details");
				Customer customer = addCustomerDetails();

				menuForProducts(customer, product);
				map.put(customer, product);

				customer.addIntoCart(map);

				break;

//			case EXISITING_CUSTOMER:
//				System.out.println("Enter Customer ID");
//				Customer cust = addCustomerDetails();
//
//				map = Customer.getProductsInCart();
//				
//				Set<Customer> c = map.keySet();
//
//				if (c.contains(cust)) {
//					menuForProducts(cust, map.get(cust));
//				} else {
//					System.out.println("Customer Not Found!!");
//				}
//
//				break;

			case GET_CUSTOMERS:
				map = Customer.deserializeCustomer();

				for (Map.Entry<Customer, ArrayList<Product>> entry : map.entrySet()) {

					System.out.println("Customer Details\n");
					printCustomerDetails(entry.getKey());

					System.out.println("Your products\n");
					printProductDetails(entry.getValue());
					
					int I = 1;
					do 
					while(I > 3)
						System.out.println("");
					while(I > 3);
				}

				break;

			case EXIT_MAIN:
				exitMain = true;
				break;

			default:
				System.out.println("Enter valid choice");
			}

			if (!exitMain) {
				System.out.println("Enter ur choice");
				System.out.println("1. Create new Customer." + "\n2. Print customer details." + "\n3. Exit");

				mainChoice = scan.nextInt();
			}
		} while (!exitMain);

	}

	private static void menuForProducts(Customer customer, ArrayList<Product> product) throws Exception {

		boolean exit = false;
		final int ADD_INTO_CART = 1, SEARCH_IN_CART = 2, DELETE_FROM_CART = 3, SHOW_CART = 4, TOTAL_CART_COST = 5,
				EXIT = 6;

		Scanner scan = new Scanner(System.in);

		System.out.println("\nEnter your choice");
		System.out.println("1. Add into cart." + "\n2. Search in cart." + "\n3. Delete from cart." + "\n4. Show Cart."
				+ "\n5. Total cart cost." + "\n6. Exit");

		int choice = scan.nextInt();

		do {
			switch (choice) {

			case ADD_INTO_CART:
				System.out.println("Enter Product Details");
				Product addProduct = addProductDetails();

				product.add(addProduct);

				break;

			case SEARCH_IN_CART:
				System.out.print("Enter prduct to be search: ");
				String searchItem = scan.next();
				try {
					ArrayList<Product> p = customer.searchFromCart(product, searchItem);

					printProductDetails(p);
				} catch (ContactNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			case DELETE_FROM_CART:
				System.out.print("Enter product to be deleted: ");
				String deleteItem = scan.next();
				try {
					customer.deleteFromCart(product, deleteItem);
					
				} catch (ContactNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			case SHOW_CART:
				printProductDetails(product);

				break;

			case TOTAL_CART_COST:
				double totalCost = customer.totalCartCost(product);
				System.out.println("Total Cart Cost: " + totalCost);
				
				break;

			case EXIT:
				exit = true;
				break;

			default:
				System.out.println("Enter valid choice");
			}

			if (!exit) {
				System.out.println("Enter your choice");
				System.out.println("1. Add into cart." + "\n2. Search in cart." + "\n3. Delete from cart."
						+ "\n4. Show Cart." + "\n5. Total cart cost." + "\n6. Exit");

				choice = scan.nextInt();
			}
		} while (!exit);

	}

	private static Customer addCustomerDetails() throws Exception {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Customer Id: ");
		int customerId = scan.nextInt();

		System.out.print("Enter Customer Name: ");
		String customerName = scan.next();

		System.out.print("Enter Purchase Date: ");
		String purchaseDate = scan.next();

		System.out.print("Enter Customer Address: ");
		String customerAddress = scan.next();

		Customer c = new Customer(customerId, customerName, purchaseDate, customerAddress);
		return c;

	}

	private static Product addProductDetails() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Product Id: ");
		int productId = scan.nextInt();

		System.out.print("Enter Product Name: ");
		String productName = scan.next();

		System.out.print("Enter Unit Price: ");
		double unitPrice = scan.nextDouble();

		System.out.print("Enter Discount: ");
		double discount = scan.nextDouble();

		discount = discount / 100.0;

		Product p = new Product(productId, productName, unitPrice, discount);
		return p;
	}

	private static void printProductDetails(ArrayList<Product> product) {

		for (Product p : product) {
			System.out.println("Product ID: " + p.getProductID());
			System.out.println("Product Name: " + p.getProductName());
			System.out.println("Product Price: " + p.getUnitPrice());
			System.out.println("Product Discount: " + (int) (p.getDiscount() * 100) + "%");
			System.out.println();
		}
	}

	private static void printCustomerDetails(Customer customer) {

//		for(Customer c: customer) {
		System.out.println("Customer ID: " + customer.getID());
		System.out.println("Customer Name: " + customer.getCustomerName());
		System.out.println("Purchase Date: " + customer.getPurchaseDate());
		System.out.println("Customer Address: " + customer.getCustomerAddress());
		System.out.println();
//		}

	}

}
