package amazonviewer.db;

public class DataBase {
	
	public static final String URL      ="jdbc:mysql://localhost:3306/";
    public static final String DB       ="amazonviewer";
    public static final String USER     ="amazonviewer";
    public static final String PASSWORD ="amazonviewer";

    public static final String TMovie  		   = "movie";
    public static final String TMovie_ID       = "id";
    public static final String TMovie_TITLE    = "title";
    public static final String TMovie_GENRE    = "genre";
    public static final String TMovie_CREATOR  ="creator";
    public static final String TMovie_DURATION = "duration";
    public static final String TMovie_YEAR     = "YEAR";

    
    public static final String IMaterial = "material";
    public static final int[] ID_MATERIALS = {1,2,3,4,5};
    
    public static final String TUSER = "user";
    public static final int TUSER_IDUSUARIO = 1;
    
    
}
