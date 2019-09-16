package com.cg.movies.dto;

import java.util.*;

	public class Customer {

		public Integer customerId;
		private String password;    
		private String customerName;
	    private List<Booking> myBooking = null;
			

			/**
			* Default constructor
			*/
		    public Customer() {
		    	
		    }

				    
		    
		    public Integer getCustomerId() {
				return customerId;
			}

			public void setCustomerId(Integer customerId) {
				this.customerId = customerId;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getCustomerName() {
				return customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			public List<Booking> getMyBooking() {
				return myBooking;
			}

			public void setMyBooking(List<Booking> myBooking) {
				this.myBooking = myBooking;
			}

			public boolean signIn(Integer customerId,  String password) {
			        // TODO implement her
					if(this.customerId.equals(customerId))
						if(this.password.equals(password))
							return true;
						
					return true;
		    }

}



