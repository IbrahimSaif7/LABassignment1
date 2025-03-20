public class Cinema{

	private String name;
	private String location;
	private Screen screens[];


	Cinema(String name, String location, int totalScreens){

		this.name=name;
		this.location=location;
		screens= new Screen[totalScreens];
	
		for(int i=0; i<totalScreens; i++){

			screens[i]= new Screen(i+1, " MOVIE "+i, 10, 10);

		}

	

	}

	public void addScreen(int index, Screen screen){

		screens[index]= screen;

	}

	public void displayCinema(){

		System.out.println("Name:   "+ name);
		System.out.println("Location:   "+ location);
		System.out.println("Screens:-");
		for(int i=0; i<screens.length; i++){

			screens[i].displayScreen();
		}




	}

}