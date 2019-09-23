package com.cg.movies.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@Column(name = "movie_id")
	private Integer movieId;
	@Column(name = "movie_name")
	private String movieName;
	@Column(name = "movie_genre")
	private String genre;
	@Column(name = "movie_director")
	private String director;
	@Column(name = "movie_length")
	private Integer movieLength;
	@Column(name = "movie_release_date")
	private Date movieReleaseDate;
	@Column(name = "movie_language")
	private String language;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "movie_theatre", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "theatre_id"))
	private List<Theatre> theatres;
	
	@OneToMany
	@JoinColumn(name = "show_id")
	private List<Show> showsList;

	
	
	
	public Movie(Integer movieId, String movieName, String genre, String director, Integer movieLength,
			Date movieReleaseDate, String language, List<Theatre> theatres, List<Show> showsList) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.director = director;
		this.movieLength = movieLength;
		this.movieReleaseDate = movieReleaseDate;
		this.language = language;
		this.theatres = theatres;
		this.showsList = showsList;
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

	public List<Theatre> getTheatres() {
		return theatres;
	}

	public void setTheatres(List<Theatre> theatres) {
		this.theatres = theatres;
	}

	public List<Show> getShowsList() {
		return showsList;
	}

	public void setShowsList(List<Show> showsList) {
		this.showsList = showsList;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", director=" + director
				+ ", movieLength=" + movieLength + ", movieReleaseDate=" + movieReleaseDate + ", language=" + language
				+ "]";
	}

	

}
