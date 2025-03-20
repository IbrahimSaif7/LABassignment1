public class Main{

	public static void main(String args[]){


		
		Cinema cinema = new Cinema("Cinepax", "gulberg", 2);

		 Screen screen1 = new Screen(1, "Avengers", 5, 5);
       		 Screen screen2 = new Screen(2, "Inception", 4, 4);

		cinema.addScreen(0, screen1);
       	        cinema.addScreen(1, screen2);

		 Customer customer1 = new Customer(10, "Maryam", "1234567890", "maryam@gmail.com");

		 boolean booked = screen1.bookSeat(2, 3, customer1);
		
		if (booked){
           	 	Ticket ticket = new Ticket(1, customer1, 1, 3, "Avengers", 15.0);
            		ticket.displayTicket();
        	}else{
            		System.out.println("Seat booking failed.");
       		 }


		System.out.println("");
		cinema.displayCinema();
	}







}