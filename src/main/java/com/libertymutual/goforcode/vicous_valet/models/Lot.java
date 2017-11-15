package com.libertymutual.goforcode.vicous_valet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList; // declare variable
	private int capacity;

	public Lot(int capacity) { // Constructor
		this.capacity = capacity;
		carList = new ArrayList<Car>(); // set it to an initial value
	}

	public void addCar(Car carToAdd) {
		if (!isLotFull()) {  // run if returns false
			carList.add(carToAdd);
		}
	}

	public void removeCarFromLot(int index) {
		carList.remove(index - 1);
	}
	
	public boolean isLotFull() {
		if (carList.size() < capacity) {
			return false;
		} else {
			return true;
		}
	}
	
	
	public int carListSize() {
		return carList.size();
	}
	

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public int getCapacity() {
		return capacity;
	}
}


