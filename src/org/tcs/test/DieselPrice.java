package org.tcs.test;

public class DieselPrice {

	public void priceOfDiesel() {
			System.out.println("price of diesel 1000");
	}
	
	private void addtoKart() {
		System.out.println("Add to Kart is added");
	}
	
	public static void main(String[] args) {
		DieselPrice d = new DieselPrice();
		d.priceOfDiesel();
		
		
		DailyRateChange ds = new DailyRateChange();
		d.priceOfDiesel();
	}
}
