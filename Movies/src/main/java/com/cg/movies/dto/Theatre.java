package com.cg.movies.dto;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "theatre")

public class Theatre {
	@Id
	@Column(name = "theatre_id")
	private Integer theatreId;
	@Column(name = "theatre_name")
	private String theatreName;
	@Column(name = "city_pincode")
	private Integer cityPincode;
	@Column(name = "theatre_city")
	private String cityName;
	
	@ManyToMany(mappedBy = "theatres", cascade = CascadeType.PERSIST)
	private List<Movie> movieList;
	
	@OneToMany
	@JoinColumn(name = "show_id")
	private List<Show> showsList;

	
	
	
	
	
	
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", cityPincode=" + cityPincode
				+ ", cityName=" + cityName + "]";
	}

	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Theatre(Integer theatreId, String theatreName, Integer cityPincode, String cityName, List<Movie> movieList,
			List<Show> showsList) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.cityPincode = cityPincode;
		this.cityName = cityName;
		this.movieList = movieList;
		this.showsList = showsList;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public Integer getCityPincode() {
		return cityPincode;
	}

	public void setCityPincode(Integer cityPincode) {
		this.cityPincode = cityPincode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	public List<Show> getShowsList() {
		return showsList;
	}

	public void setShowsList(List<Show> showsList) {
		this.showsList = showsList;
	}
	
	
}
