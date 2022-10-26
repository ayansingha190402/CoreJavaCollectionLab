//defining pacakage
package com.StoreProduct;

//importing packages 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//defining the class Store 
public class Store {

	//defining main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring object for Scanner class 
		Scanner sc=new Scanner(System.in);
		
		//declaring ArrayList for Product
		List<Product> item = new ArrayList<>();
		
		//adding items
		item.add(new Product(1101, "BISCUITS", " BRITANNIA - GOOD DAY ", 100, 10));
		item.add(new Product(1102, "BISCUITS", " SUNFEAST - MILK MADE ", 80, 10));
		item.add(new Product(1103, "BISCUITS", " OREO ", 600, 20));
		item.add(new Product(1104, "CHOCOLATE BAR", " AMUL DARK", 60, 50));
		item.add(new Product(1105, "CHOCOLATE BAR", " CADBURY - DAILY MILK", 250, 20));
		item.add(new Product(1106, "BODY OIL", " JAC OLIVOL", 200, 120));
		item.add(new Product(1107, "BODY OIL ", " OLIVE ALMONF", 150, 140));
		item.add(new Product(1108, "SOAP", " MEDIMIX ", 70, 39));
		item.add(new Product(1108, "SOAP", " PEARS", 50, 55));
		item.add(new Product(11010, "FRUIT  JUICE", " REAL", 250, 70));
		item.add(new Product(11011, "DEODRANTS", " DENVER", 50, 250));
		
		
		//printing 
		System.out.println("PRESS 1: FOR SORT BY PRODUCT PRICE");
		System.out.println("PRESS 2: FOR SORT BY PRODUCT QUANTITY");
		System.out.println("ENTER YOUR CHOICE");
		
		//taking user input 
		int choice=sc.nextInt();
		
		//starting of switch case 
		switch(choice)
		{
			case 1: item.sort((Product p1, Product p2)->p1.getPrice()-p2.getPrice()); 
					item.forEach((Person) -> System.out.println(Person));
					break;
			case 2: item.sort((Product p1, Product p2)->p1.getQuantity()-p2.getQuantity()); 
					item.forEach((Person) -> System.out.println(Person));
					break;
			default: System.out.println("Wrong Input...............");
		}//end 

		

	}// end of main method 

}//end of Store class 
