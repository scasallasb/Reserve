package casallasStorieDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



import amazonviewer.db.IDBconnection;
import models.Movie;

import static amazonviewer.db.DataBase.*;


public interface MovieDAO extends IDBconnection {
	
	default Movie setMovieViewed(Movie movie) {
		return movie;		
	}
	
	default ArrayList<Movie>  read(){
		ArrayList<Movie> movies = new ArrayList();
		
		
		try(Connection connection = connecToDB()){
			String query="SELECT * FROM  " + TMovie; 
			
			PreparedStatement preparedstatement=  connection.prepareStatement(query); 
			ResultSet rs = preparedstatement.executeQuery();
			
			
			while (rs.next()) {
				Movie movie = new Movie(rs.getString(TMovie_TITLE), 
										rs.getString(TMovie_GENRE), 
										rs.getString(TMovie_CREATOR), 
										Integer.valueOf(rs.getString(TMovie_DURATION)), 
										Short.valueOf(rs.getString(TMovie_YEAR)));
				movie.setId(Integer.valueOf(rs.getString(TMovie_ID))) ;
				movies.add(movie);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return movies;
	} 
	
	private boolean getMovieViewed() {
		return false;	
	}

}
