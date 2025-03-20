
public class Customer{

	private int customerid;
	private String name;
	private String phoneNumber;
	private String email;
	
	Customer(int customerid, String name, String phoneNumber, String email){

		this.customerid=customerid;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;

		

	}

	public boolean equals(Object obj){

		Customer c = (Customer)obj;
		if(c.customerid==this.customerid && this.name==c.name && this.phoneNumber==c.phoneNumber && this.email==c.email){

			return true;
		
		}else{
			return false;
		}	

	}

	public void displayCustomer(){

		System.out.println("ID:  " + customerid);
		System.out.println("name:  " + name);
		System.out.println("number  :  " + phoneNumber);
		System.out.println("email:   " + email);

	}



}