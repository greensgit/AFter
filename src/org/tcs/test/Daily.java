package org.tcs.test;

public class Daily extends PetrolPrice {
	
	@Override
	public void priceOfPetrol() {
		System.out.println("petrol price is 4000");
	}
	
	public static void main(String[] args) {
		Daily d= new Daily();
		d.priceOfPetrol();
	}

}
