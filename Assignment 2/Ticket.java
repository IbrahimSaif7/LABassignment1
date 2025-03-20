public class Ticket{

	private int ticketid;
	private Customer customer;
	private int screennum;
	private int seatnum;
	private String movieTitle;
	private double price;


	Ticket(int id, Customer c, int snum, int seatnum, String title, double price ){

		ticketid=id;
		customer=c;
		screennum=snum;
		seatnum=seatnum;
		movieTitle=title;
		this.price=price;


	}

	public void displayTicket(){

		System.out.println("Ticket id :  "+ ticketid);
		System.out.println("Screen num :  "+ screennum);
		System.out.println("Seat num :  "+ seatnum);
		System.out.println("Title :  " + movieTitle);
		System.out.println("price :  "+ price);





	}
	





}