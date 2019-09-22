package com.cg.movies.dao;
import com.cg.movies.util.DBUtil;
import com.cg.movies.dto.*;
import com.cg.movies.exception.*;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TheatreDaoImpl implements TheatreDao{

	private static Connection connection;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	private static Logger myLogger;
	static {
		Properties props = System.getProperties();
		String userDir = props.getProperty("user.dir") + "/src/main/resources/";
		System.out.println("Current working directory is " + userDir);
		PropertyConfigurator.configure(userDir + "log4j.properties");
		myLogger = Logger.getLogger("TheatreDaoImpl.class");
	}

	static {
		try {
			connection = DBUtil.getConnection();
			myLogger.info("connection Obtained!!");
		} catch (MyException e) {
			myLogger.error("Connection Not Obtained at authorDao : " + e);
		}
	}
		    private static Map<Integer, Theatre> theatres = new HashMap<>();
		    

	/* author divya */   

		    public Boolean addTheatre(Theatre theatre) throws MyException {
				// TODO Auto-generated method stub
				int noOfRec = 0;
				System.out.println(theatre);
				String sql = "insert into theatre(theatre_name,theatre_city,city_pincode,delete_flag) values(?,?,?,?)";
				try {
					// step1 : obtain psz
					ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
					// step 2: set the ps placeholder values
					ps.setString(1, theatre.getTheatreName());
					ps.setString(2, theatre.getCityName());
					ps.setLong(3, theatre.getCityPincode());
					ps.setInt(4, 0);
					// step 3: execute Query (for DML we have executeUpdate method )
					noOfRec = ps.executeUpdate();
				} catch (SQLException e) {
					myLogger.error(" Error at addTheatre Dao method : " + e);
					throw new MyException(" Error at addTheatre Dao method : " + e);
				} finally {
					if (ps != null) {
						try {
							ps.close();
						} catch (SQLException e) {
							myLogger.error(" Error at addTheatre Dao method : " + e);
						}
					}
				}
				if (noOfRec > 0) {
					return true;

				} else {
					return false;
				}

			}


			@Override
			public Boolean addMovie(Movie movie) throws Exception {
				
				int noOfRec1 = 0;
				System.out.println(movie);
				String sql = "insert into movie(movie_name,movie_genre,movie_director,movie_length,movie_language,theatre_id) values(?,?,?,?,?,?)";
//				String sql1 = "Alter table movie set delete_flag=1 where";
				try {
					// step1 : obtain psz
					ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
					// step 2: set the ps placeholder values
//					ps.setString(1, movie.getMovieName());
//					ps.setString(2, movie.getGenre());
//					ps.setString(3, movie.getDirector());
//					ps.setInt(4, movie.getMovieLength());
//					ps.setString(5, movie.getLanguage());
//					//ps.setLong(6, (movie.getMovieReleaseDate()));
//					ps.setInt(6, movie.getTheatre());
					// step 3: execute Query (for DML we have executeUpdate method )
					noOfRec1 = ps.executeUpdate();
				} catch (SQLException e) {
					myLogger.error(" Error at add Movie Dao method : " + e);
					throw new MyException(" Error at add Movie Dao method : " + e);
				} finally {
					if (ps != null) {
						try {
							ps.close();
						} catch (SQLException e) {
							myLogger.error(" Error at add Movie Dao method : " + e);
						}
					}
				}
				if (noOfRec1 > 0) {
					return true;

				} else {
					return false;
				}

				
			}

			@Override
			public Boolean addShow(Show show) throws Exception {
				System.out.println("Dao layer add show");
				return null;
			}

			@Override
			public Boolean deleteMovie(Integer theatreid) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}

		

			}




