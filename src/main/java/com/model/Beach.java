package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beach {
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="beachName", length=30)			
	private String beachName;
	private String beachDescription;
	private String beachBrief;
	private String beachPath;
	private String beachAbout;
	private String beachAbout1;
	private String beachAbout2;
	private String beachPrice;
	private String beachPrice1;
	private String beachPrice2;
	public Beach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Beach(int prodId, String beachName, String beachDescription, String beachBrief, String beachPath,
			String beachAbout, String beachAbout1, String beachAbout2, String beachPrice, String beachPrice1,
			String beachPrice2) {
		super();
		this.prodId = prodId;
		this.beachName = beachName;
		this.beachDescription = beachDescription;
		this.beachBrief = beachBrief;
		this.beachPath = beachPath;
		this.beachAbout = beachAbout;
		this.beachAbout1 = beachAbout1;
		this.beachAbout2 = beachAbout2;
		this.beachPrice = beachPrice;
		this.beachPrice1 = beachPrice1;
		this.beachPrice2 = beachPrice2;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getBeachName() {
		return beachName;
	}
	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}
	public String getBeachDescription() {
		return beachDescription;
	}
	public void setBeachDescription(String beachDescription) {
		this.beachDescription = beachDescription;
	}
	public String getBeachBrief() {
		return beachBrief;
	}
	public void setBeachBrief(String beachBrief) {
		this.beachBrief = beachBrief;
	}
	public String getBeachPath() {
		return beachPath;
	}
	public void setBeachPath(String beachPath) {
		this.beachPath = beachPath;
	}
	public String getBeachAbout() {
		return beachAbout;
	}
	public void setBeachAbout(String beachAbout) {
		this.beachAbout = beachAbout;
	}
	public String getBeachAbout1() {
		return beachAbout1;
	}
	public void setBeachAbout1(String beachAbout1) {
		this.beachAbout1 = beachAbout1;
	}
	public String getBeachAbout2() {
		return beachAbout2;
	}
	public void setBeachAbout2(String beachAbout2) {
		this.beachAbout2 = beachAbout2;
	}
	public String getBeachPrice() {
		return beachPrice;
	}
	public void setBeachPrice(String beachPrice) {
		this.beachPrice = beachPrice;
	}
	public String getBeachPrice1() {
		return beachPrice1;
	}
	public void setBeachPrice1(String beachPrice1) {
		this.beachPrice1 = beachPrice1;
	}
	public String getBeachPrice2() {
		return beachPrice2;
	}
	public void setBeachPrice2(String beachPrice2) {
		this.beachPrice2 = beachPrice2;
	}
	@Override
	public String toString() {
		return "Beach [prodId=" + prodId + ", beachName=" + beachName + ", beachDescription=" + beachDescription
				+ ", beachBrief=" + beachBrief + ", beachPath=" + beachPath + ", beachAbout=" + beachAbout
				+ ", beachAbout1=" + beachAbout1 + ", beachAbout2=" + beachAbout2 + ", beachPrice=" + beachPrice
				+ ", beachPrice1=" + beachPrice1 + ", beachPrice2=" + beachPrice2 + "]";
	}
	
}
