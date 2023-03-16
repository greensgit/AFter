package org.tcs.test;

public class JoceMa {
	
	public void studentDetails() {
		System.out.println("My name is Jocelyn Rajgovind");

	}
	
	public void studentDetails(int age) {
		System.out.println("Age of the student is "+age);
	}
	

	public void studentDetails(int pinCode,String gender) {
		System.out.println("pincode is" +pinCode);
		System.out.println("gender is" +gender);
	}
	

	public void studentDetails(String companyName,int studentId) {
		
		System.out.println("companyName is" +companyName);
		System.out.println(" student id is" +studentId);
	}
	
	public static void main(String[] args) {
		System.out.println("Program start");
		//classname objectname = new classname();
		
		JoceMa j = new JoceMa();//memory alloocate
		
		//objectname.methoname
		j.studentDetails();
		
		
		j.studentDetails("CTS", 32423);
		j.studentDetails(26);
		j.studentDetails(600020, "Female");
	}

}
