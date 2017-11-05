package demo;

import javassist.bytecode.ByteArray;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@Entity
public class Images {
	
	 private static final long serialVersionUID = -2929008106626811914L;
	
	@Id
	private int id;
	
	@ManyToOne
	private Artist artist;
	//@Column(columnDefinition = "blob")
    private String img;
    
    public Images(){
    	
    }
	public Images(Artist artist, int id, String img) {
		super();
		this.artist = artist;
		this.id= id;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
     
}
