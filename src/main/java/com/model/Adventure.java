package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adventure {
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="adventureName", length=30)			
	private String adventureName;
	private String adventureDescription;
	private String adventureBrief;
	private String adventurePath;
	private String adventureAbout;
	private String adventureAbout1;
	private String adventureAbout2;
	private String adventurePrice;
	private String adventurePrice1;
	private String adventurePrice2;
	public Adventure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adventure(int prodId, String adventureName, String adventureDescription, String adventureBrief,
			String adventurePath, String adventureAbout, String adventureAbout1, String adventureAbout2,
			String adventurePrice, String adventurePrice1, String adventurePrice2) {
		super();
		this.prodId = prodId;
		this.adventureName = adventureName;
		this.adventureDescription = adventureDescription;
		this.adventureBrief = adventureBrief;
		this.adventurePath = adventurePath;
		this.adventureAbout = adventureAbout;
		this.adventureAbout1 = adventureAbout1;
		this.adventureAbout2 = adventureAbout2;
		this.adventurePrice = adventurePrice;
		this.adventurePrice1 = adventurePrice1;
		this.adventurePrice2 = adventurePrice2;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getAdventureName() {
		return adventureName;
	}
	public void setAdventureName(String adventureName) {
		this.adventureName = adventureName;
	}
	public String getAdventureDescription() {
		return adventureDescription;
	}
	public void setAdventureDescription(String adventureDescription) {
		this.adventureDescription = adventureDescription;
	}
	public String getAdventureBrief() {
		return adventureBrief;
	}
	public void setAdventureBrief(String adventureBrief) {
		this.adventureBrief = adventureBrief;
	}
	public String getAdventurePath() {
		return adventurePath;
	}
	public void setAdventurePath(String adventurePath) {
		this.adventurePath = adventurePath;
	}
	public String getAdventureAbout() {
		return adventureAbout;
	}
	public void setAdventureAbout(String adventureAbout) {
		this.adventureAbout = adventureAbout;
	}
	public String getAdventureAbout1() {
		return adventureAbout1;
	}
	public void setAdventureAbout1(String adventureAbout1) {
		this.adventureAbout1 = adventureAbout1;
	}
	public String getAdventureAbout2() {
		return adventureAbout2;
	}
	public void setAdventureAbout2(String adventureAbout2) {
		this.adventureAbout2 = adventureAbout2;
	}
	public String getAdventurePrice() {
		return adventurePrice;
	}
	public void setAdventurePrice(String adventurePrice) {
		this.adventurePrice = adventurePrice;
	}
	public String getAdventurePrice1() {
		return adventurePrice1;
	}
	public void setAdventurePrice1(String adventurePrice1) {
		this.adventurePrice1 = adventurePrice1;
	}
	public String getAdventurePrice2() {
		return adventurePrice2;
	}
	public void setAdventurePrice2(String adventurePrice2) {
		this.adventurePrice2 = adventurePrice2;
	}
	@Override
	public String toString() {
		return "Adventure [prodId=" + prodId + ", adventureName=" + adventureName + ", adventureDescription="
				+ adventureDescription + ", adventureBrief=" + adventureBrief + ", adventurePath=" + adventurePath
				+ ", adventureAbout=" + adventureAbout + ", adventureAbout1=" + adventureAbout1 + ", adventureAbout2="
				+ adventureAbout2 + ", adventurePrice=" + adventurePrice + ", adventurePrice1=" + adventurePrice1
				+ ", adventurePrice2=" + adventurePrice2 + "]";
	}
	
	
}
