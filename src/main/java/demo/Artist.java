package demo;

import java.util.Collection;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private String email;
	private String pass;
	private String name;
	private String phone;
	private String country;
	private String city;
	private int rating;
	private String studio;
	private String address;
	private String avatarImg;
	private String website;
	private String cover;
	@ElementCollection
	private List<String> list;
	
	public Artist(int id, String email, String pass, String name, String phone,
			String country, String city, int rating, String studio,
			String address, String avatarImg, String website, String cover, List<String> list) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.rating = rating;
		this.studio = studio;
		this.address = address;
		this.avatarImg = avatarImg;
		this.website = website;
		this.cover = cover;
		this.list = list;
	}

	@OneToMany
	private Collection<Images> images;
	
	public Artist(){
		
	}
	
	public Artist(int id, String email, String pass, String name, String phone,
			String country, String city) {
		super();
		this.id=id;
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.country = country;
		this.city = city;
	}
	
	public int getId(){
		 return this.id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getname() {
		return name;
	}
	public void name(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "registration [e_mail=" + email + ", pass=" + pass + ", name=" + name + ", phone=" + phone + ", country=" + country + ", city=" + city + "]";
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvatarImg() {
		return avatarImg;
	}

	public void setAvatarImg(String avatarImg) {
		this.avatarImg = avatarImg;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
}

