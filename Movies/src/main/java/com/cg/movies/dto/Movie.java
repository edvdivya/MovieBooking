package com.cg.movies.dto;
import java.util.Date;
import java.util.Objects;

	public class Movie {
		private Integer movieId;
		private String movieName;
		private String genre;
		private String director;
		private Integer movieLength;
		private Date movieReleaseDate;
		private String language;
		private Theatre theatre;
		
		public Movie(Integer movieId, String movieName, String genre, String director, Integer movieLength,
				Date movieReleaseDate, String language, Theatre theatre) {
			super();
			this.movieId = movieId;
			this.movieName = movieName;
			this.genre = genre;
			this.director = director;
			this.movieLength = movieLength;
			this.movieReleaseDate = movieReleaseDate;
			this.language = language;
			this.theatre = theatre;
		}
		public Movie() {
			// TODO Auto-generated constructor stub
		}
		public Integer getMovieId() {
			return movieId;
		}
		public void setMovieId(Integer movieId) {
			this.movieId = movieId;
		}
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public Integer getMovieLength() {
			return movieLength;
		}
		public void setMovieLength(Integer movieLength) {
			this.movieLength = movieLength;
		}
		public Date getMovieReleaseDate() {
			return movieReleaseDate;
		}
		public void setMovieReleaseDate(Date movieReleaseDate) {
			this.movieReleaseDate = movieReleaseDate;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public Theatre getTheatre() {
			return theatre;
		}
		public void setTheatre(Theatre theatre) {
			this.theatre = theatre;
		}
		

		
	}

