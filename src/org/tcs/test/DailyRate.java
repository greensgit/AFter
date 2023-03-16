package org.tcs.test;

public class DailyRate extends GoldPrice{
	
	@Override
	public void priceOfGold() {

		System.out.println("Gold price is 23433");
	}
	
	@Override
	public void priceOfSilver() {
		 System.out.println("Silver price is 1200");
	}
	
	public static void main(String[] args) {
		DailyRate d = new DailyRate();
		d.priceOfGold();
		d.priceOfSilver();
	}
}
