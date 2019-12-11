package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class book extends Publication implements Ivisulisable {

	private int id ;
	private boolean readed;
	private int timeReaded;
	
	
	
	private ArrayList<page> pages;

	

	public book(String title, Date edititionDate, String editorial, String[] authors,ArrayList<page>  pages) {
		super(title, edititionDate, editorial, authors);
		// TODO Auto-generated constructor stub
		setAuthors(authors);
		this.pages=pages;
		
	}
	

	
	public boolean isReaded( ) {
		String leido = "";
		if(readed == true) {
			leido = "Si";
		}else {
			leido = "No";
		}
		
		return readed;
	}

	
	public boolean getReaded() {
		readed=isReaded();
		return readed;
	}


	public void setReaded(boolean readed) {
		this.readed = readed;
	}


	
	
	public int getTimeReaded() {
		return timeReaded;
	}


	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook = "\n :: BOOK ::" + 
							"\n Title: " + getTitle() +
							"\n Editorial: " + getEditorial() + 
							"\n Edition Date: " + getEdititionDate() +
							"\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return  detailBook;
	}

	
	
	
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	

	public ArrayList<page> getPages() {
		return pages;
	}


	public void setPages(ArrayList<page> pages) {
		this.pages = pages;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeReaded(0);
		}
	}

	
	


	public void view() {
		
		setReaded(true);
		Date dateI = startToSee(new Date());
	    
		int i =0;
		do {
			System.out.println("......");
			System.out.println("paginas del libro    "+ getPages().get(i).getNumber());
			System.out.println(getPages().get(i).getContent());
			
			if (i !=0) {
				
		 System.out.println("1: Regresar a la pagina");		
		}
		System.out.println("2: Siguiente  pagina");		
		System.out.println("0: cerrar libro");	
		System.out.println();
		
			
			
			Util util = new Util();
			int response = util.validateUserResponseMenu(0, 2);
			
			if(response ==2) {
				i++;
			}else if (response ==1) {
				i--;
			} else if(response==0) {
				
				break;
			}
			
			
		}while(i < getPages().size());
		
		
		
		//Termine de verla
				stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Leiste: " + toString());
				System.out.println("Por: " + getTimeReaded() + " segundos");
				
				
	}
		
		
	
	public static ArrayList<book> makeBookList() {
		ArrayList<book> books = new ArrayList();
		String[] authors = new String[3];
		for (int i = 0; i < 3; i++) {
			authors[i] = "author "+i;
		}
		
		ArrayList<page> pages = new ArrayList();
		int pagina=0;
		for (int i = 0; i <= 2; i++) {
			pagina=i+1;
			pages.add(new book.page(pagina, "el contenido de la pagina"+ pagina));
		} 
		
		for (int i = 1; i <= 5; i++) {
			books.add(new book("Book " + i, new Date(), "editorial " + i, authors,pages));
		}
		
		return books;
	}

	

	public static class page{
		private int id;
		private int number;
		private String content;
		public page(int number, String content) {
			super();
			this.number = number;
			this.content = content;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		
			
			
		}
		
		
	}
	
	
	

