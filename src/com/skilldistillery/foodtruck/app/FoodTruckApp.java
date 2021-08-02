package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruck[] foodTrucks = new FoodTruck[5];
		FoodTruckApp foodTruckApp = new FoodTruckApp();

		foodTruckApp.inputFoodTruckInfo(foodTrucks);

		foodTruckApp.displayTrucks(foodTrucks);
		foodTruckApp.displayMenus(foodTrucks);

	}

	public void displayMenus(FoodTruck[] trucks) {
		int selection = 0;

		while (selection != 4) {
			System.out.println("********** PLEASE SELECT A NUMBER **********");
			System.out.println("1) List all existing food trucks");
			System.out.println("2) See an average of food trucks ratings");
			System.out.println("3) Display the highest rated food truck");
			System.out.println("4) Quit");
			selection = kb.nextInt();
			kb.nextLine();
			switch (selection) {
			case 1:
				truckNames(trucks);

				break;
			case 2:
				averageRating(trucks);
				break;
			case 3:
				highestRated(trucks);
				break;
			case 4:
				System.out.println("You have chosen to quit, GOODBYE!");
				break;
			default:
				System.err.println("Invalid Selection, Please try again.");
				break;
				
			}

		}

	}
	

	public void highestRated(FoodTruck[] trucks ) {
		FoodTruck lowest = trucks[0];
		FoodTruck highest = trucks[0];

		for (int i = 0; i < trucks.length; i++) {
			FoodTruck ft = trucks[i];
			
			if(ft != null) {
				if(lowest.getNumRating() > trucks[i].getNumRating()) {
					lowest = trucks[i];
					
				}
				if(highest.getNumRating() < trucks[i].getNumRating()) {
					highest = trucks[i];
					
				}
			}

		}
		System.out.println("The highest rated truck is: " + highest);
	}

	public void averageRating(FoodTruck[] trucks) {
		int ratingsTot = 0;
		int count = 0;
		for ( int i = 0; i < trucks.length;i++) {
			FoodTruck fT = trucks[i];
			if (fT != null) {
				ratingsTot += fT.getNumRating();
				count++;
				
			}
			
		}
		double avg = (double) ratingsTot / count;
		System.out.println("The total trucks average is: "+ Math.round((avg)*10.0)/10.0);
		
		}

	

	public void truckNames(FoodTruck[] trucks) {
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] == (null)) {
				continue;

			}
			System.out.println(trucks[i].getName());

		}
	}

	public void inputFoodTruckInfo(FoodTruck[] trucks) {
		for (int i = 0; i < trucks.length; i++) {
			System.out.println("Please enter the name of the food truck: ");
			String name = kb.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.println("Please enter the type of food the truck serves: ");
			String foodType = kb.nextLine();
			System.out.println("Please enter your rating: ");
			int numRating = kb.nextInt();
			kb.nextLine();
			FoodTruck foodTruck = new FoodTruck(name, foodType, numRating);
			trucks[i] = foodTruck;

		}

	}

	public void displayTrucks(FoodTruck[] trucks) {
		for (int i = 0; i < trucks.length; i++) {

			System.out.println(trucks[i]);
			

		}
	}

}
