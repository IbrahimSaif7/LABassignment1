public class Seat{

	private int seatNumber;
	private int rowNumber;
	private String seatType;
	private double price;
	private boolean isBooked;

	Seat(int seatNumber, int rowNumber, String seatType, double price){

		this.seatNumber=seatNumber;
		this.rowNumber=rowNumber;
		this.seatType=seatType;
		this.price=price;
		
	}

	public boolean bookSeat(){

		if(isBooked==false){
			isBooked = true;
			return true;
		}else{

			return false;
		}
	}

	public void display(){

		System.out.println("Seat Number:   " + seatNumber);
		System.out.println("Row Number:   " + rowNumber);
		System.out.println("Seat Type:   " + seatType);
		System.out.println("Seat price:   " + price);		

	}








}