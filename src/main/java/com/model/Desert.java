package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Desert {
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="desertName", length=30)			
	private String desertName;
	private String desertDescription;
	private String desertPath;
	private String desertBrief;
	private String desertAbout;
	private String desertAbout1;
	private String desertAbout2;
	private String desertPrice;
	private String desertPrice1;
	private String desertPrice2;
	public Desert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Desert(int prodId, String desertName, String desertDescription, String desertPath, String desertBrief,
			String desertAbout, String desertAbout1, String desertAbout2, String desertPrice, String desertPrice1,
			String desertPrice2) {
		super();
		this.prodId = prodId;
		this.desertName = desertName;
		this.desertDescription = desertDescription;
		this.desertPath = desertPath;
		this.desertBrief = desertBrief;
		this.desertAbout = desertAbout;
		this.desertAbout1 = desertAbout1;
		this.desertAbout2 = desertAbout2;
		this.desertPrice = desertPrice;
		this.desertPrice1 = desertPrice1;
		this.desertPrice2 = desertPrice2;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getDesertName() {
		return desertName;
	}
	public void setDesertName(String desertName) {
		this.desertName = desertName;
	}
	public String getDesertDescription() {
		return desertDescription;
	}
	public void setDesertDescription(String desertDescription) {
		this.desertDescription = desertDescription;
	}
	public String getDesertPath() {
		return desertPath;
	}
	public void setDesertPath(String desertPath) {
		this.desertPath = desertPath;
	}
	public String getDesertBrief() {
		return desertBrief;
	}
	public void setDesertBrief(String desertBrief) {
		this.desertBrief = desertBrief;
	}
	public String getDesertAbout() {
		return desertAbout;
	}
	public void setDesertAbout(String desertAbout) {
		this.desertAbout = desertAbout;
	}
	public String getDesertAbout1() {
		return desertAbout1;
	}
	public void setDesertAbout1(String desertAbout1) {
		this.desertAbout1 = desertAbout1;
	}
	public String getDesertAbout2() {
		return desertAbout2;
	}
	public void setDesertAbout2(String desertAbout2) {
		this.desertAbout2 = desertAbout2;
	}
	public String getDesertPrice() {
		return desertPrice;
	}
	public void setDesertPrice(String desertPrice) {
		this.desertPrice = desertPrice;
	}
	public String getDesertPrice1() {
		return desertPrice1;
	}
	public void setDesertPrice1(String desertPrice1) {
		this.desertPrice1 = desertPrice1;
	}
	public String getDesertPrice2() {
		return desertPrice2;
	}
	public void setDesertPrice2(String desertPrice2) {
		this.desertPrice2 = desertPrice2;
	}
	@Override
	public String toString() {
		return "Desert [prodId=" + prodId + ", desertName=" + desertName + ", desertDescription=" + desertDescription
				+ ", desertPath=" + desertPath + ", desertBrief=" + desertBrief + ", desertAbout=" + desertAbout
				+ ", desertAbout1=" + desertAbout1 + ", desertAbout2=" + desertAbout2 + ", desertPrice=" + desertPrice
				+ ", desertPrice1=" + desertPrice1 + ", desertPrice2=" + desertPrice2 + "]";
	}
	
	
}
