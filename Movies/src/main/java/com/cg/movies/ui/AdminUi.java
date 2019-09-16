package com.cg.movies.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.movies.dto.Movie;
import com.cg.movies.dto.Screen;
import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.service.TheatreService;
import com.cg.movies.service.TheatreServiceImpl;

public class AdminUi {
	Map<Date, List<String>> bookedSeats = new HashMap<Date, List<String>>();
	Map<Date, List<String>> blockedSeats = new HashMap<Date, List<String>>();
	ArrayList<Show> listofShowsMovie1 = new ArrayList<Show>();
	ArrayList<Show> listofShowsMovie2 = new ArrayList<Show>();
	ArrayList<Movie> listofMovies = new ArrayList<Movie>();
	TheatreService service = new TheatreServiceImpl();
	ArrayList<Screen> listofScreensT1 = new ArrayList<Screen>();
	ArrayList<Screen> listofScreensT2 = new ArrayList<Screen>();
	ArrayList<Screen> listofScreensT3 = new ArrayList<Screen>();
	
	
	public AdminUi() {
		
	}
	
	public Theatre addTheatre() throws Exception {
		Theatre theatre1 = new Theatre("Elante Mall", 160087, "kurnool", "Chandigarh", "Rajveer", "9814357234",
				listofScreensT1, listofMovies);
		Theatre theatre2 = new Theatre("Wave Cinemas", 160023, "Chandigarh", "Chandigarh", "Priyank", "8965234121",
				listofScreensT2, listofMovies);
		Theatre theatre3 = new Theatre("Saket CityMall", 140078, "Delhi", "Chandigarh", "Balwinder", "7865435652",
				listofScreensT3, listofMovies);
		service.addTheatre(theatre1);
		service.addTheatre(theatre2);
		service.addTheatre(theatre3);
		
		return null;
	}
	
	public Movie addMovie(Movie movie) {
		try {
			Date releaseDate = null;
			Movie movie1 = new Movie("Article 15", "Comedy Drama", "Rajkumar Hirani", 125, releaseDate, "English");
			Movie movie2 = new Movie("Romeo Akbar Walter", "Thriller Drama", "SiddraJ Films", 195, releaseDate,
					"Hindi");

			listofMovies.add(movie1);
			listofMovies.add(movie2);
			
		} catch (Exception e) {
			System.out.println("Check date format");

		}
		return null;
	}
	

	public Movie addMovieToTheatre(Scanner scanner) throws Exception {
		
		service.getTheatres();
		
		System.out.println("Enter The Theater Id to where you want to add your movie: ");
		int theaterid = scanner.nextInt();
		// method call with theater Id

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
		System.out.println("Enter the movie release date");
		
		
		DateFormat sdf = null, sdf1 = null;
		Date date = sdf.parse(scanner.nextLine());
		System.out.println("Enter the movie language");
		String language = scanner.nextLine();

		Movie movie = new Movie(name, genre, director, movieLength, date, language);

		Show show = new Show(movie, sdf.parse("2019-06-28"), language, sdf1.parse("12:05:00"), sdf1.parse("3:05:00"),
				bookedSeats, blockedSeats);
		System.out.println(service.getScreensInTheatre(theaterid).size() + " Screens exist");
		System.out.println("Existing Screen Id are: ");
		for (int i = 0; i < service.getScreensInTheatre(theaterid).size(); i++) {
			System.out.println(service.getScreensInTheatre(theaterid).get(i).getScreenId());
		}
		System.out.println("Enter the screen you want to add movie to: ");
		// increment should be for each theatre
		int numberofMovies = service.getMoviesinTheatre(theaterid).size();
		service.addShow(theaterid, scanner.nextInt(), show);
		int updatedNumberofMovies = service.getMoviesinTheatre(theaterid).size();
		if (updatedNumberofMovies > numberofMovies) {
			System.out.println("Movie Added");
			for (int i = 0; i < service.getMoviesinTheatre(theaterid).size(); i++) {
				System.out.println(service.getMoviesinTheatre(theaterid).get(i).getMovieId() + " "
						+ service.getMoviesinTheatre(theaterid).get(i).getMovieName());
			}
		} else {
			System.out.println("Movie could not be added");
		}

		scanner.nextLine();

		return null;
	}
	
	
	public Screen addScreen() {
		
		Screen screenT11 = new Screen(5, 5, listofShowsMovie1);
		Screen screenT21 = new Screen(5, 5, listofShowsMovie2);
		Screen screenT22 = new Screen(5, 5, listofShowsMovie1);
		Screen screenT31 = new Screen(5, 5, listofShowsMovie2);
		Screen screenT32 = new Screen(5, 5, listofShowsMovie2);
		

		listofScreensT1.add(screenT11);
		listofScreensT2.add(screenT21);
		listofScreensT2.add(screenT22);
		listofScreensT3.add(screenT31);
		listofScreensT3.add(screenT32);
		
		return null;
	}
	
	
	public Show addShow() throws Exception {
		

		SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
		java.util.Date showOneStartTime = sdf1.parse("14:00:00");// screen1
		java.util.Date showOneEndTime = sdf1.parse("15:30:00");
		java.util.Date showTwoStartTime = sdf1.parse("08:0:00");// screen2
		java.util.Date showTwoEndTime = sdf1.parse("11:30:00");
		java.util.Date showThreeStartTime = sdf1.parse("16:00:00");// screen2
		java.util.Date showThreeEndTime = sdf1.parse("19:30:00");

		
		Date movieEndDate = null;
		
		Show showM11 = new Show(listofMovies.get(0), movieEndDate, "English", showOneStartTime, showOneEndTime, bookedSeats,
				blockedSeats);
		Show showM12 = new Show(listofMovies.get(0), movieEndDate, "English", showTwoStartTime, showTwoEndTime, bookedSeats,
				blockedSeats);
		Show showM21 = new Show(listofMovies.get(1), movieEndDate, "English", showOneStartTime, showOneEndTime, bookedSeats,
				blockedSeats);
		Show showM22 = new Show(listofMovies.get(1), movieEndDate, "English", showTwoStartTime, showTwoEndTime, bookedSeats,
				blockedSeats);
		Show showM23 = new Show(listofMovies.get(1), movieEndDate, "English", showThreeStartTime, showThreeEndTime, bookedSeats,
				blockedSeats);
		

		listofShowsMovie1.add(showM11);
		listofShowsMovie1.add(showM12);
		listofShowsMovie2.add(showM21);
		listofShowsMovie2.add(showM22);
		listofShowsMovie2.add(showM23);
		return null;
	}
}
