package org.tcs.test;

public class DailyRateChange extends DieselPrice {
	
	@Override
	public void priceOfDiesel() {
		System.out.println("Diesel price is 5000");
	}
	
	public static void main(String[] args) {
		
		DailyRateChange d = new DailyRateChange();
		d.priceOfDiesel();
	}

}
