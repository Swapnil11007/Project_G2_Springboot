package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Safari {
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="safariName", length=30)			
	private String safariName;
	private String safariDescription;
	private String safariBrief;
	private String safariPath;
	private String safariAbout;
	private String safariAbout1;
	private String safariAbout2;
	private String safariPrice;
	private String safariPrice1;
	private String safariPrice2;
	
	public Safari() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Safari(int prodId, String safariName, String safariDescription, String safariBrief, String safariPath,
			String safariAbout, String safariAbout1, String safariAbout2, String safariPrice, String safariPrice1,
			String safariPrice2) {
		super();
		this.prodId = prodId;
		this.safariName = safariName;
		this.safariDescription = safariDescription;
		this.safariBrief = safariBrief;
		this.safariPath = safariPath;
		this.safariAbout = safariAbout;
		this.safariAbout1 = safariAbout1;
		this.safariAbout2 = safariAbout2;
		this.safariPrice = safariPrice;
		this.safariPrice1 = safariPrice1;
		this.safariPrice2 = safariPrice2;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getSafariName() {
		return safariName;
	}

	public void setSafariName(String safariName) {
		this.safariName = safariName;
	}

	public String getSafariDescription() {
		return safariDescription;
	}

	public void setSafariDescription(String safariDescription) {
		this.safariDescription = safariDescription;
	}

	public String getSafariBrief() {
		return safariBrief;
	}

	public void setSafariBrief(String safariBrief) {
		this.safariBrief = safariBrief;
	}

	public String getSafariPath() {
		return safariPath;
	}

	public void setSafariPath(String safariPath) {
		this.safariPath = safariPath;
	}

	public String getSafariAbout() {
		return safariAbout;
	}

	public void setSafariAbout(String safariAbout) {
		this.safariAbout = safariAbout;
	}

	public String getSafariAbout1() {
		return safariAbout1;
	}

	public void setSafariAbout1(String safariAbout1) {
		this.safariAbout1 = safariAbout1;
	}

	public String getSafariAbout2() {
		return safariAbout2;
	}

	public void setSafariAbout2(String safariAbout2) {
		this.safariAbout2 = safariAbout2;
	}

	public String getSafariPrice() {
		return safariPrice;
	}

	public void setSafariPrice(String safariPrice) {
		this.safariPrice = safariPrice;
	}

	public String getSafariPrice1() {
		return safariPrice1;
	}

	public void setSafariPrice1(String safariPrice1) {
		this.safariPrice1 = safariPrice1;
	}

	public String getSafariPrice2() {
		return safariPrice2;
	}

	public void setSafariPrice2(String safariPrice2) {
		this.safariPrice2 = safariPrice2;
	}

	@Override
	public String toString() {
		return "Safari [prodId=" + prodId + ", safariName=" + safariName + ", safariDescription=" + safariDescription
				+ ", safariBrief=" + safariBrief + ", safariPath=" + safariPath + ", safariAbout=" + safariAbout
				+ ", safariAbout1=" + safariAbout1 + ", safariAbout2=" + safariAbout2 + ", safariPrice=" + safariPrice
				+ ", safariPrice1=" + safariPrice1 + ", safariPrice2=" + safariPrice2 + "]";
	}

	
}
