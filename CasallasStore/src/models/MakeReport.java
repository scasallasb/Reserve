package models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MakeReport {

	private String nameFile;
	private String title;
	private String content;
	private String extension;
	
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void makeReport()  {
		if(getNameFile()!=null && getTitle()!=null && getContent()!=null) {
			//Crear el archivo
			File  file = new File(getNameFile()+"."+getExtension());
			try {
				
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw =new OutputStreamWriter(fos);
				BufferedWriter bw =new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	
}
