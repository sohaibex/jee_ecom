package bean;

import java.util.Date;

public class Article {
	private int ida;
	private String libelleArt;
	private float prix ;
	private String details ;
	private String description ;
	private String url_img ;
	private String couleur;
	private Date dateAjout ;
	private int idcat;
	private boolean promotion;
	
	public int getIda() {
		return ida;
	}
	public boolean isPromotion() {
		return promotion;
	}
	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}
	public void setIda(int ida) {
		this.ida = ida;
	}
	public String getLibelleArt() {
		return libelleArt;
	}
	public void setLibelleArt(String libelleArt) {
		this.libelleArt = libelleArt;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl_img() {
		return url_img;
	}
	public void setUrl_img(String url_img) {
		this.url_img = url_img;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	
}

