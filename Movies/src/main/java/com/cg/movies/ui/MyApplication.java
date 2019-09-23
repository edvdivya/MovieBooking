package com.cg.movies.ui;

import com.cg.movies.dto.*;
import com.cg.movies.service.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyApplication {

	public static void main(String[] args) throws Exception {

		AdminService adminService = new AdminServiceImpl();
		CustomerService customerService = new CustomerServiceImpl();
		MovieService movieService = new MovieServiceImpl();
		ShowService showService = new ShowServiceImpl();
		TheatreService theatreService = new TheatreServiceImpl();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");

		Scanner scanner = new Scanner(System.in);
		int count = 2;
		while ((count--) > 0) {
			System.out.println("****************  Start Page  ********************");
			System.out.println("BELOW ARE THE PREFERRED ROLES");
			System.out.println("1. Admin");
			System.out.println("2. Registered User");
			System.out.println("3. Unregistered User");
			System.out.println("4. Exit");
			System.out.println("Enter the type of User you are: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1. Add Theater");
				System.out.println("2. Add Movie To Theatre");
				System.out.println("3. Add Movie Show");
				System.out.println("4. Remove Movie From Theater");
				System.out.println("5. Get Theatres");
				System.out.println("6. Quit");
				System.out.println("Enter Function Number you want to perform: ");
				int input = scanner.nextInt();
				switch (input) {
				case 1:
					System.out.println("Enter the Theatre Details as asked: ");
					scanner.nextLine();
					System.out.println("Enter the Theatre name");
					String theatreName = scanner.nextLine();
					System.out.println("Enter the Theatre City");
					String theatreCity = scanner.nextLine();
					System.out.println("Enter the City Pincode");
					Integer city_pincode;
					try {
						city_pincode = scanner.nextInt();
					} catch (Exception e) {
						throw new Exception("Please enter valid pincode.");
					}
					scanner.nextLine();
					Theatre theatre = new Theatre();
					System.out.println("");
					try {
						theatreService.save(theatre);
						System.out.println("Theatre Added");
					} catch (Exception exception) {
						System.out.println(exception.getMessage());
					}
					break;
				case 2:
//					service.getTheatres();
					System.out.println("Enter The Theater Id to which you want to add movie: ");
					int theaterid = scanner.nextInt();
					System.out.println("Enter the Movie Details as asked: ");
					scanner.nextLine();
					System.out.println("Enter the movie name");
					String name = scanner.nextLine();
					System.out.println("Enter the genre name");
					String genre = scanner.nextLine();
					System.out.println("Enter the director name");
					String director = scanner.nextLine();
					System.out.println("Enter the movie length ");
					Integer movieLength = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter the movie release date"); // today or next
					Date release_date = sdf.parse(scanner.nextLine());
					System.out.println("Enter the movie language");
					String language = scanner.nextLine();

					Movie movie = new Movie();

					try {
						movieService.save(movie); // set other flags 1
						System.out.println("Movie Added");
					} catch (Exception exception) {
						System.out.println(exception.getMessage());
					}
					break;
				case 3:
					System.out.println("Enter the TheatreId: ");
					Integer theatreid = scanner.nextInt();
					Integer movieId = 0; // get from method
//					/movie_name=service.getMovieinTheatre(theatreid); //where flag is 0
//					System.out.println("Enter the date for Movie Show: "+movie_name);
					Date show_date = sdf.parse(scanner.nextLine());
					System.out.println("Enter the show timings");
					Date show_timings = sdf1.parse(scanner.nextLine());
					System.out.println("Enter number of booked seats");
					Integer booked_seats = scanner.nextInt();
					System.out.println("Enter number of available seats");
					Integer available_seats = scanner.nextInt();
//					Show show = new Show(movieId,theatreid,booked_seats,available_seats,show_date,show_timings);
					System.out.println("");
					try {
//						 service.addShow(show); //set other flags 1
						System.out.println("Show Added");
					} catch (Exception exception) {
						System.out.println(exception.getMessage());
					}
					break;
				case 4:
					System.out.println("Enter the theatre id");
					// fetch showcased movie
//					service.deleteMovie(scanner.nextInt());
					break;
				case 5:
//					service.getTheatres();
					break;
				case 6:
					exit(1);
					break;
				}
				break;
			case 2:
				System.out.println("1. Login");
				System.out.println("2. View Movies");
				System.out.println("3. Quit");
				System.out.println("Enter Your choice: ");
				int userChoice = scanner.nextInt();
				switch (userChoice) {

				case 1:
					System.out.println("Enter the UserName");
					String userName = scanner.next();
					System.out.println("Enter the Password: ");
					String userPass = scanner.next();
					Boolean validate_customer = customerService.validateCustomer(userName, userPass);
					if (validate_customer == true) {
						System.out.println("You've been successfully logged in");
						System.out.println("1. Book Tickets");
						System.out.println("2. View Bookings");
						System.out.println("3. Cancel Bookings");
						System.out.println("Enter your choice");
						int userFunction = scanner.nextInt();
						switch (userFunction) {

						case 1:
							// get movies list from database
							System.out.println("Enter the Movie Id you want to book");
							// get theaters from database with that movie
							// enter the theater to watch movie
							// get the shows in that theater with that movie
							// enter show id to book tickets for
							// enter the number of seats
							// get amount to be paid
							// add booking

							break;
						case 2:
							// pass username to get userid
							// get bookings with this userid

							break;
						case 3:
							// pass username to get userid
							// get bookings with this userid
							// remove booking by setting flag 1 to that booking
							break;

						}
					} else {
						System.out.println("Entered Username and password combination does not exist");
						System.out.println("Please register or check the credentials");
						exit(1);
					}

				case 2:
					// get movies in theaters
					// get show for them
					break;
				case 3:
					exit(1);
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
					Customer customer = new Customer();
					System.out.println("Enter userid");
					BigInteger userid = scanner.nextBigInteger();
					System.out.println("Enter Username");
					String customerName = scanner.next();
					System.out.println("Enter the Password");
					String customerPass = scanner.next();
					System.out.println("Confirm Password");
					String confirmPass = scanner.next();
					if (customerPass.equals(confirmPass)) {
						System.out.println("Password Matched");
						System.out.println("Enter your Phone number");
						String contactNumber = scanner.next();
						customer.setCustomerId(userid);
						customer.setCustomerName(customerName);
						customer.setCustomerPassword(customerPass);
						customer.setContactNumber(contactNumber);
						try {
							System.out.println(customerService.addCustomer(customer));
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} else {
						System.out.println("Password doesn't Match");
						exit(1);
					}

					break;
				case 2:
					// get movies in theaters
					// get show for them
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
