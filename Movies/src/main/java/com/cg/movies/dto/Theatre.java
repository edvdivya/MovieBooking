package com.cg.movies.dto;

import java.util.List;

public class Theatre {
	
	    private Integer theatreId;
	    private String theatreName;
	    private Integer cityPincode;
	    private String cityName;
	    	   


	    public Theatre(Integer theatreId,String theatreName, String cityName, Integer cityPincode) {
	        this.theatreId = theatreId;
	        this.theatreName = theatreName;
	        this.cityPincode = cityPincode;
	        this.cityName = cityName;
	   
	        
	    }

	    public Theatre() {
			// TODO Auto-generated constructor stub
		}

		public Theatre(String theatreName2, String theatreCity, Integer city_pincode) {
			// TODO Auto-generated constructor stub
			   
		        this.theatreName = theatreName2;
		        this.cityPincode = city_pincode;
		        this.cityName = theatreCity;
		}

		public Integer getTheatreId() {
	        return theatreId;
	    }

	    public String getTheatreName() {
	        return theatreName;
	    }

	    public Integer getCityPincode() {
	        return cityPincode;
	    }

	    public String getCityName() {
	        return cityName;
	    }
	    
	    public void setTheatreId(Integer theatreId) {
	        this.theatreId = theatreId;
	    }
	    
	    public void setTheatreName(String theatreName) {
	        this.theatreName = theatreName;
	    }
	    
	    public void setCityName(String cityName) {
	        this.cityName = cityName;
	    }
	   
	    public void setCityPincode(Integer cityPincode) {
	        this.cityPincode = cityPincode;
	    }
	   
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
	        result = prime * result + ((cityPincode == null) ? 0 : cityPincode.hashCode());
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
	        if (theatreName == null) {
	            if (other.theatreName != null)
	                return false;
	        } else if (!theatreName.equals(other.theatreName))
	            return false;
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Theatre{" +
	                "theatreId=" + theatreId +
	                ", theatreName='" + theatreName + '\'' +
	                ", cityPincode=" + cityPincode +
	                ", cityName='" + cityName + '\'' +
	                '}';
	    }
	}



