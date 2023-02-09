package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Snow {
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="snowName", length=30)			
	private String snowName;
	private String snowDescription;
	private String snowBrief;
	private String snowPath;
	private String snowAbout;
	private String snowAbout1;
	private String snowAbout2;
	private String snowPrice;
	private String snowPrice1;
	private String snowPrice2;
	public Snow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Snow(int prodId, String snowName, String snowDescription, String snowBrief, String snowPath,
			String snowAbout, String snowAbout1, String snowAbout2, String snowPrice, String snowPrice1,
			String snowPrice2) {
		super();
		this.prodId = prodId;
		this.snowName = snowName;
		this.snowDescription = snowDescription;
		this.snowBrief = snowBrief;
		this.snowPath = snowPath;
		this.snowAbout = snowAbout;
		this.snowAbout1 = snowAbout1;
		this.snowAbout2 = snowAbout2;
		this.snowPrice = snowPrice;
		this.snowPrice1 = snowPrice1;
		this.snowPrice2 = snowPrice2;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getSnowName() {
		return snowName;
	}
	public void setSnowName(String snowName) {
		this.snowName = snowName;
	}
	public String getSnowDescription() {
		return snowDescription;
	}
	public void setSnowDescription(String snowDescription) {
		this.snowDescription = snowDescription;
	}
	public String getSnowBrief() {
		return snowBrief;
	}
	public void setSnowBrief(String snowBrief) {
		this.snowBrief = snowBrief;
	}
	public String getSnowPath() {
		return snowPath;
	}
	public void setSnowPath(String snowPath) {
		this.snowPath = snowPath;
	}
	public String getSnowAbout() {
		return snowAbout;
	}
	public void setSnowAbout(String snowAbout) {
		this.snowAbout = snowAbout;
	}
	public String getSnowAbout1() {
		return snowAbout1;
	}
	public void setSnowAbout1(String snowAbout1) {
		this.snowAbout1 = snowAbout1;
	}
	public String getSnowAbout2() {
		return snowAbout2;
	}
	public void setSnowAbout2(String snowAbout2) {
		this.snowAbout2 = snowAbout2;
	}
	public String getSnowPrice() {
		return snowPrice;
	}
	public void setSnowPrice(String snowPrice) {
		this.snowPrice = snowPrice;
	}
	public String getSnowPrice1() {
		return snowPrice1;
	}
	public void setSnowPrice1(String snowPrice1) {
		this.snowPrice1 = snowPrice1;
	}
	public String getSnowPrice2() {
		return snowPrice2;
	}
	public void setSnowPrice2(String snowPrice2) {
		this.snowPrice2 = snowPrice2;
	}
	@Override
	public String toString() {
		return "Snow [prodId=" + prodId + ", snowName=" + snowName + ", snowDescription=" + snowDescription
				+ ", snowBrief=" + snowBrief + ", snowPath=" + snowPath + ", snowAbout=" + snowAbout + ", snowAbout1="
				+ snowAbout1 + ", snowAbout2=" + snowAbout2 + ", snowPrice=" + snowPrice + ", snowPrice1=" + snowPrice1
				+ ", snowPrice2=" + snowPrice2 + "]";
	}
	
	
}
