public class Screen{

	private int screenNumber;
	private String movieTitle;
	Seat seats[][]; 


	Screen(int screenNumber, String movieTitle, int rows, int cols){

		this.screenNumber=screenNumber;
		this.movieTitle=movieTitle;
		seats=new Seat[rows][cols];
		int count=0;
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){

				seats[i][j]= new Seat(count++, i, "Regular", 700.0);

			}

		

		}

	}

	public boolean bookSeat(int row, int col, Customer customer){

		if(seats[row][col].bookSeat()==true){
			return true;
		}else{
			return false;
		}

	}

	public void displayScreen(){

		System.out.println("Screen number:  " + screenNumber);
		System.out.println("Movie Title:  " + movieTitle);
		System.out.println("Seats:-");

		for(int i=0; i<seats.length; i++){
			for(int j=0; j<seats[i].length; j++){
				seats[i][j].display();
				
			}


		}


	}



}