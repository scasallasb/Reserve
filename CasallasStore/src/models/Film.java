package models;

public abstract class Film {
	
	
	private static String title;
	private String genre;
	private String creator;
	private float  duration ;
	private short  year;
	private boolean viewed;
	
	public Film() {
	}
	
	
	public Film(String title, String genre, String creator, float  duration,short year ) {
		super();
		this.title = title;
		this.genre = genre;
		this.year= year;
		this.creator = creator;
		this.duration = duration;
	}
	
	
	//generar gegtters y setters 
	
	
	public String  getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title= title;
	}
	
	

	public String  getGenre(){
		return genre ;
	}
	

	public void setGenre (String genre ) {
		this.genre= genre;
	}
	
	
	
	public String  getCreator(){
		return creator;
	}
	
	

	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	

	public float   getDuration(){
		return duration;
	}
	

	public void setDuration(float Duration) {
		this.duration = duration;
	}
	
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	
	
	
	public String isViewed() {
		/*
		String visto = "";
		
		if (viewed == true){
			visto = "true";
			}else  {
				
				visto ="false";
			}
		
		return visto;*/
		String visto = null;
		visto = viewed ? "Sí" : "No";
		return visto;
	}
	
	
	
	
	 public boolean getViwed() {
		 
		return viewed;
	 }
	
	 public boolean getIsViewed() {
			return viewed;
		}
	
	 
	 public void setViewed(boolean viewed) {
			this.viewed = viewed;
		}
	 
	 public abstract void view();
	
	
	
}

