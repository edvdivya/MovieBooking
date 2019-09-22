package com.cg.movies.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="theatre")
public class Theatre {
		@Id
		@Column(name="theatreId")
	    private  Integer theatreId;
		@Column(name="theatreName")
	    private  String theatreName;
		@Column(name="cityPincodee")
	    private  Integer cityPincode;
		@Column(name="cityName")
	    private  String cityName;
		@Column(name="deleteFlag")
		private int deleteFlag; 
	   
	    @ManyToMany(mappedBy = "theatreList")
	    private List<Movie> movies;
	    
	    public Theatre() {
	    	
	    }

		public Theatre(Integer theatreId, String theatreName, Integer cityPincode, String cityName, int deleteFlag,
				List<Movie> movies) {
			super();
			this.theatreId = theatreId;
			this.theatreName = theatreName;
			this.cityPincode = cityPincode;
			this.cityName = cityName;
			this.deleteFlag = deleteFlag;
			this.movies = movies;
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

		public int getDeleteFlag() {
			return deleteFlag;
		}

		public void setDeleteFlag(int deleteFlag) {
			this.deleteFlag = deleteFlag;
		}

		public List<Movie> getMovies() {
			return movies;
		}

		public void setMovies(List<Movie> movies) {
			this.movies = movies;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
			result = prime * result + ((cityPincode == null) ? 0 : cityPincode.hashCode());
			result = prime * result + deleteFlag;
			result = prime * result + ((movies == null) ? 0 : movies.hashCode());
			result = prime * result + ((theatreId == null) ? 0 : theatreId.hashCode());
			result = prime * result + ((theatreName == null) ? 0 : theatreName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Theatre other = (Theatre) obj;
			if (cityName == null) {
				if (other.cityName != null)
					return false;
			} else if (!cityName.equals(other.cityName))
				return false;
			if (cityPincode == null) {
				if (other.cityPincode != null)
					return false;
			} else if (!cityPincode.equals(other.cityPincode))
				return false;
			if (deleteFlag != other.deleteFlag)
				return false;
			if (movies == null) {
				if (other.movies != null)
					return false;
			} else if (!movies.equals(other.movies))
				return false;
			if (theatreId == null) {
				if (other.theatreId != null)
					return false;
			} else if (!theatreId.equals(other.theatreId))
				return false;
			if (theatreName == null) {
				if (other.theatreName != null)
					return false;
			} else if (!theatreName.equals(other.theatreName))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", cityPincode=" + cityPincode
					+ ", cityName=" + cityName + ", deleteFlag=" + deleteFlag + ", movies=" + movies + "]";
		}
		
		
	    
	    
	    
	    
}
	    