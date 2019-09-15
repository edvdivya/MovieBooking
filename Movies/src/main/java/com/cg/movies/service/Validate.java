package com.cg.movies.service;
import com.cg.movies.dao.*;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Validate {
	
	    private static TheatreDao dao = new TheatreDaoImpl();

	    static boolean validate_theatre(Theatre theatre) throws UserException {
	        String str=""+theatre.getTheatreId();
	        try{
	            Integer.parseInt(str);
	        }
	        catch(Exception e){
	            theatre.setCount();
	            throw new UserException("Integer contains only numbers");
	        }
	        str=""+theatre.getCityPincode();
	        if(!str.matches("\\d+")){
	            theatre.setCount();
	            throw new UserException("city pincode contains only digits");
	        }
	        str=""+theatre.getManagerContact();
	        if(!str.matches("\\d{10}")){
	            theatre.setCount();
	            throw new UserException("contact number should be 10 digits");
	        }
	        if(!theatre.getCityName().matches("[a-zA-Z]+")){
	            theatre.setCount();
	            throw new UserException("city name can not have special charecters");
	        }
	        return true;
	    }
	    static boolean validate_duplicate(Theatre theatre) throws UserException {
	        List<Map.Entry<Integer,Theatre>> temp = new ArrayList<>(dao.getTheatres().entrySet());
	        for(int i=0;i<temp.size();i++){
	            if(temp.get(i).getValue().equals(theatre)){
	                theatre.setCount();
	                throw new UserException("Theatre already exists");
	            }
	        }
	        return false;
	    }
	    // it can be used for all id verification
	    static boolean validate_Ids(Integer id) throws UserException {
	        String str=""+id;
	        if(!str.matches("\\d+")){
	            throw new UserException("city pincode contains only digits");
	        }
	        return true;
	    }
	    static boolean validate_name(String str) throws UserException {
	        if(!str.matches("[a-zA-Z]+")){
	            throw new UserException("name can not contain special charecters");
	        }
	        return false;
	    }
	}



