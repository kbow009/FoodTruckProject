package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private String name;
	private String foodType;
	private int numRating;

	private int truckId = 0;
	private static int numOfTrucks;

	public FoodTruck(String name, String foodType, int numRating) {
		numOfTrucks++;
		this.truckId = numOfTrucks;
		this.name = name;

		this.foodType = foodType;
		this.numRating = numRating;

	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public static int getNumOfTrucks() {
		return numOfTrucks;
	}

	public static void setNumOfTrucks(int numOfTrucks) {
		FoodTruck.numOfTrucks = numOfTrucks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getNumRating() {
		return numRating;
	}

	public void setNumRating(int numRating) {
		this.numRating = numRating;
	}

	@Override
	public String toString() {
		return "FoodTruck [ name = " + name + ", foodType = " + foodType + ", numRating = " + numRating + ", truckId = "
				+ truckId + " ]";
	}

}