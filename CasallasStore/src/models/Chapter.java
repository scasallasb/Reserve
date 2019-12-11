package models;

import java.util.ArrayList;
import java.util.Date;

public class Chapter  extends Movie{
	
	private int id;
	private int sessionNumber;
	private Serie serie; 
	
	private ArrayList<Chapter> chapters;
	
	

	public Chapter(String title, String genre, String creator, float duration, short year, int sesionNumber, Serie serie) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.sessionNumber= sessionNumber;
		
	}
	
	
	@Override
	public int   getId() {
			return this.id;
	}


	public int getSessionNumber() {
		return sessionNumber;
	}


	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	
	public Serie getSerie() {
		return serie;
	}


	public void setSerie(Serie serie) {
		this.serie = serie;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: CHAPTER ::" + 
				"\n Title: " + getTitle() +
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
	
	
	

	public static ArrayList<Chapter> makeChaptersList(Serie serie) {
		ArrayList<Chapter> chapters = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Capituo "+i, "genero "+i, "creator" +i, 45, (short)(2017+i), i, serie));
		}
		
		return chapters;
	}
	
	@Override
	public void view() {
		super.view();
		ArrayList<Chapter> chapters = getSerie().getChapters();
		int chapterViewedCounter =0;
		for (Chapter chapter : chapters) {
			if (chapter.getIsViewed()) {
				chapterViewedCounter++;
			}
		}
		if (chapterViewedCounter==chapters.size() ) {
			getSerie().setViewed(true);
		}
		
	}
	
	

}
