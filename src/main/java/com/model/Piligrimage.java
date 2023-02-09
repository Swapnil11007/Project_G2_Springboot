package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Piligrimage {
	
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="piligrimName", length=30)			
	private String piligrimName;
	private String piligrimDescription;
	private String piligrimBrief;
	private String piligrimPath;
	private String piligrimAbout;
	private String piligrimAbout1;
	private String piligrimAbout2;
	private String piligrimPrice;
	private String piligrimPrice1;
	private String piligrimPrice2;
	
	
	public Piligrimage() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Piligrimage(int prodId, String piligrimName, String piligrimDescription, String piligrimBrief,
			String piligrimPath, String piligrimAbout, String piligrimAbout1, String piligrimAbout2,
			String piligrimPrice, String piligrimPrice1, String piligrimPrice2) {
		super();
		this.prodId = prodId;
		this.piligrimName = piligrimName;
		this.piligrimDescription = piligrimDescription;
		this.piligrimBrief = piligrimBrief;
		this.piligrimPath = piligrimPath;
		this.piligrimAbout = piligrimAbout;
		this.piligrimAbout1 = piligrimAbout1;
		this.piligrimAbout2 = piligrimAbout2;
		this.piligrimPrice = piligrimPrice;
		this.piligrimPrice1 = piligrimPrice1;
		this.piligrimPrice2 = piligrimPrice2;
	}


	public int getProdId() {
		return prodId;
	}


	public void setProdId(int prodId) {
		this.prodId = prodId;
	}


	public String getPiligrimName() {
		return piligrimName;
	}


	public void setPiligrimName(String piligrimName) {
		this.piligrimName = piligrimName;
	}


	public String getPiligrimDescription() {
		return piligrimDescription;
	}


	public void setPiligrimDescription(String piligrimDescription) {
		this.piligrimDescription = piligrimDescription;
	}


	public String getPiligrimBrief() {
		return piligrimBrief;
	}


	public void setPiligrimBrief(String piligrimBrief) {
		this.piligrimBrief = piligrimBrief;
	}


	public String getPiligrimPath() {
		return piligrimPath;
	}


	public void setPiligrimPath(String piligrimPath) {
		this.piligrimPath = piligrimPath;
	}


	public String getPiligrimAbout() {
		return piligrimAbout;
	}


	public void setPiligrimAbout(String piligrimAbout) {
		this.piligrimAbout = piligrimAbout;
	}


	public String getPiligrimAbout1() {
		return piligrimAbout1;
	}


	public void setPiligrimAbout1(String piligrimAbout1) {
		this.piligrimAbout1 = piligrimAbout1;
	}


	public String getPiligrimAbout2() {
		return piligrimAbout2;
	}


	public void setPiligrimAbout2(String piligrimAbout2) {
		this.piligrimAbout2 = piligrimAbout2;
	}


	public String getPiligrimPrice() {
		return piligrimPrice;
	}


	public void setPiligrimPrice(String piligrimPrice) {
		this.piligrimPrice = piligrimPrice;
	}


	public String getPiligrimPrice1() {
		return piligrimPrice1;
	}


	public void setPiligrimPrice1(String piligrimPrice1) {
		this.piligrimPrice1 = piligrimPrice1;
	}


	public String getPiligrimPrice2() {
		return piligrimPrice2;
	}


	public void setPiligrimPrice2(String piligrimPrice2) {
		this.piligrimPrice2 = piligrimPrice2;
	}


	@Override
	public String toString() {
		return "Piligrimage [prodId=" + prodId + ", piligrimName=" + piligrimName + ", piligrimDescription="
				+ piligrimDescription + ", piligrimBrief=" + piligrimBrief + ", piligrimPath=" + piligrimPath
				+ ", piligrimAbout=" + piligrimAbout + ", piligrimAbout1=" + piligrimAbout1 + ", piligrimAbout2="
				+ piligrimAbout2 + ", piligrimPrice=" + piligrimPrice + ", piligrimPrice1=" + piligrimPrice1
				+ ", piligrimPrice2=" + piligrimPrice2 + "]";
	}
	
	
}