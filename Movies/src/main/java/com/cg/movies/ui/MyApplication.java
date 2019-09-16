package com.cg.movies.ui;

import com.cg.movies.dto.Admin;
import com.cg.movies.dto.Booking;
import com.cg.movies.dto.Customer;
import com.cg.movies.dto.Movie;
import com.cg.movies.dto.Screen;
import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.service.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class MyApplication {

	public static void main(String[] args) throws Exception {
		AdminUi adminUi = new AdminUi();
		CustomerUi customerUi = new CustomerUi();
		
		Theatre theatre;
		Movie movie;
		Show show;
		Screen screen;
		Customer customer;
		Admin admin;
		Booking booking;
		Seat seat;
		
		Scanner scanner = new Scanner(System.in);
		int count = 2;
		while ((count--) > 0) {
			System.out.println("BELOW ARE THE PREFERRED ROLES");
			System.out.println("1. Admin");
			System.out.println("2. Registered User");
			System.out.println("3. Unregistered User");
			System.out.println("4. Exit");
			System.out.println("Enter the type of User you are: ");
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				System.out.println("1. Add Movie To Theater");
				System.out.println("2. Remove Movie Show From Theater");
				System.out.println("3. Add Theater");
				System.out.println("4. Delete Theater");
				System.out.println("5. Get Cities");
				System.out.println("6. Get Theatres");
				System.out.println("7. Quit");
				System.out.println("Enter Function Number you want to perform: ");
				int input = scanner.nextInt();
				switch (input) {

				case 1:
					// show theater list
					Movie movieAdded;
					movieAdded = adminUi.addMovieToTheatre(scanner);
					
					// add 2 validations here one for theatre id input and other for movie details

					break;
				case 2:
					
					System.out.println("Enter the theatre Id to remove Movie: ");
					int theatreId = scanner.nextInt();
					for (int i = 0; i < service.getMoviesinTheatre(theatreId).size(); i++) {
						System.out.println(service.getMoviesinTheatre(theatreId).get(i).getMovieId() + " "
								+ service.getMoviesinTheatre(theatreId).get(i).getMovieName());
						}
					
					for (int i = 0; i < service.getScreensInTheatre(theatreId).size(); i++) {
						System.out.println(service.getScreensInTheatre(theatreId).get(i));
					}
					System.out.println("Enter the screen id in which you want to delete");
					Integer screenId = scanner.nextInt();
					for (int i = 0; i < service.getShowsInScreen(theatreId, screenId).size(); i++) {
						System.out.println(service.getShowsInScreen(theatreId, screenId).get(i));
					}
					System.out.println("Enter the show id to delete");
					service.deleteShow(theatreId, screenId, scanner.nextInt());
					scanner.nextLine();
					break;
				case 3:
					System.out.println("Enter the theatre details");
					try {
						service.addTheatre(new Theatre("Elante", 160087, "rajmundry", "Chandigarh", "Rajveer","9814357234", listofScreensT1, listofMovies));
					} catch (Exception exception) {
						System.out.println(exception.getMessage());
					}
					break;
				case 4:
					// show list of movies
					List<Map.Entry<Integer, Theatre>> theatres = new ArrayList<Entry<Integer, Theatre>>(service.getTheatres().entrySet());
					for (int i = 0; i < theatres.size(); i++) {
						System.out.println(theatres.get(i).getValue());
					}
					System.out.println("Enter the theatre id");
					service.deleteTheatre(scanner.nextInt());
					break;
				case 5:
					List<Map.Entry<Integer, String>> cities = new ArrayList<Entry<Integer, String>>(service.getCities().entrySet());
					for (int i = 0; i < cities.size(); i++) {
						System.out.println(cities.get(i).getKey() + " " + cities.get(i).getValue());
					}
					break;
				case 6:
					// show list of Theaters(optional to show movies in each theaters)
					Map<Integer, Theatre> theatresm = service.getTheatres();
					List<Map.Entry<Integer, Theatre>> theatreList = new ArrayList<Entry<Integer, Theatre>>(theatresm.entrySet());
					for (int i = 0; i < theatreList.size(); i++) {
						System.out.println(theatreList.get(i).getValue());
					}
					break;

				case 7:
					exit(1);

				}
				break;

			case 2:
				System.out.println("1. Login");
				System.out.println("2. Book tickets");
				System.out.println("3. Cancel tickets");
				System.out.println("4. Quit");
				System.out.println("Enter Your choice: ");
				int userChoice = scanner.nextInt();
				switch (userChoice) {

				case 1:
					System.out.println("Enter the UserId: ");
					Integer userId = scanner.nextInt();
					System.out.println("Enter the Password: ");
					String password = scanner.next();
					
					
				case 2:
					List<Map.Entry<Integer, String>> cities = new ArrayList<Entry<Integer, String>>(service.getCities().entrySet());
					for (int i = 0; i < cities.size(); i++) {
						System.out.println(cities.get(i).getKey() + " " + cities.get(i).getValue());
					}
					System.out.println("choose city pincode");
					Integer pincode = scanner.nextInt();
					System.out.println("enter your option ");
					System.out.println("1 for search by theatre");
					System.out.println("2 for search by movie");
					Integer option = scanner.nextInt();
					
					break;
				case 3:
					// prints list of movies
					System.out.println("Select movie you want to see shows for");
					String bookMovie = scanner.next();
					// method call by movie name
					// print list of theaters that showcase that movie
					System.out.println("Select Theater");
					String bookTheater = scanner.next();
					// print show for that movie id in this theater id by fetching theater id from
					// theater name
					System.out.println("Select Show");
					// method call to book show
					break;

				}
				break;

			case 3:
				System.out.println("1. Register");
				System.out.println("2. View Movies Shows");
				System.out.println("3. Exit");
				int viewerChoice = scanner.nextInt();
				switch (viewerChoice) {

				case 1:
					
					break;
					
					
				case 2:
					// prints list of movies
					System.out.println("Select movie you want to see shows for");
					for (int i = 0; i < listofMovies.size(); i++) {
						System.out.println(listofMovies.get(i));
					}
					String choseMovie = scanner.next();

					// print list of theaters that showcase that movie
					System.out.println("Select Theater");
					String choseTheater = scanner.next();
					// print show for that movie id in this theater id by fetching theater id from
					// theater name
					break;
				case 3:
					exit(1);
				}
				break;
			case 4:
				exit(1);
			}

		}

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub

	}

}
