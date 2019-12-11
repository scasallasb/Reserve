package models;

import java.util.ArrayList;
import java.util.Date;

import casallasStorieDao.MovieDAO;

public class Movie extends Film implements Ivisulisable, MovieDAO {

	
	private int  id;
	private int timeViewed;
	public Movie() {
		
	}
	
	
	public Movie(String title, String genre, String creator, float duration, short year ) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
	}

	
	
	public int getId() {
		return id;
	}
	
	
	public int getTimeViewed() {
		return timeViewed;
	}
	
	public void setTimeViewed(int setTimeViewed) { 
	this.timeViewed= setTimeViewed; 
     }
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: MOVIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
	
	

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}



	@Override
	public void stopToSee(Date dateI, Date datef) {
		// TODO Auto-generated method stub
		if ( datef.getSeconds()>dateI.getSeconds()) {
			
			setTimeViewed((int)datef.getSeconds()-dateI.getSeconds());
		}else {
			
			setTimeViewed(0);
		}
		
		
	}
	
	
	
	public static ArrayList <Movie> makeMoviesList() {
	Movie movie = new Movie()	;
	return movie.read();
		
	}



	public void setId(int id) {
		this.id = id;
	}


	@Override
	public void view() {
		// TODO Auto-generated method stub
		setViewed(true);
		Date dateI = startToSee(new Date());
		
		for (int i = 0; i < 100000; i++) {
			System.out.println("..........");
		}
		
		//Termine de verla
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("Viste: " + toString());
		System.out.println("Por: " + getTimeViewed() + " milisegundos");
	}



	
	
	
	
	
	
	
	
}
