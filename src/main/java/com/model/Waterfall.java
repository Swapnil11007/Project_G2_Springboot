package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Waterfall {
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="waterfallName", length=30)			
	private String waterfallName;
	private String waterfallDescription;
	private String waterfallBrief;
	private String waterfallPath;
	private String waterfallAbout;
	private String waterfallAbout1;
	private String waterfallAbout2;
	private String waterfallPrice;
	private String waterfallPrice1;
	private String waterfallPrice2;
	
	public Waterfall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Waterfall(int prodId, String waterfallName, String waterfallDescription, String waterfallBrief,
			String waterfallPath, String waterfallAbout, String waterfallAbout1, String waterfallAbout2,
			String waterfallPrice, String waterfallPrice1, String waterfallPrice2) {
		super();
		this.prodId = prodId;
		this.waterfallName = waterfallName;
		this.waterfallDescription = waterfallDescription;
		this.waterfallBrief = waterfallBrief;
		this.waterfallPath = waterfallPath;
		this.waterfallAbout = waterfallAbout;
		this.waterfallAbout1 = waterfallAbout1;
		this.waterfallAbout2 = waterfallAbout2;
		this.waterfallPrice = waterfallPrice;
		this.waterfallPrice1 = waterfallPrice1;
		this.waterfallPrice2 = waterfallPrice2;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getWaterfallName() {
		return waterfallName;
	}

	public void setWaterfallName(String waterfallName) {
		this.waterfallName = waterfallName;
	}

	public String getWaterfallDescription() {
		return waterfallDescription;
	}

	public void setWaterfallDescription(String waterfallDescription) {
		this.waterfallDescription = waterfallDescription;
	}

	public String getWaterfallBrief() {
		return waterfallBrief;
	}

	public void setWaterfallBrief(String waterfallBrief) {
		this.waterfallBrief = waterfallBrief;
	}

	public String getWaterfallPath() {
		return waterfallPath;
	}

	public void setWaterfallPath(String waterfallPath) {
		this.waterfallPath = waterfallPath;
	}

	public String getWaterfallAbout() {
		return waterfallAbout;
	}

	public void setWaterfallAbout(String waterfallAbout) {
		this.waterfallAbout = waterfallAbout;
	}

	public String getWaterfallAbout1() {
		return waterfallAbout1;
	}

	public void setWaterfallAbout1(String waterfallAbout1) {
		this.waterfallAbout1 = waterfallAbout1;
	}

	public String getWaterfallAbout2() {
		return waterfallAbout2;
	}

	public void setWaterfallAbout2(String waterfallAbout2) {
		this.waterfallAbout2 = waterfallAbout2;
	}

	public String getWaterfallPrice() {
		return waterfallPrice;
	}

	public void setWaterfallPrice(String waterfallPrice) {
		this.waterfallPrice = waterfallPrice;
	}

	public String getWaterfallPrice1() {
		return waterfallPrice1;
	}

	public void setWaterfallPrice1(String waterfallPrice1) {
		this.waterfallPrice1 = waterfallPrice1;
	}

	public String getWaterfallPrice2() {
		return waterfallPrice2;
	}

	public void setWaterfallPrice2(String waterfallPrice2) {
		this.waterfallPrice2 = waterfallPrice2;
	}

	@Override
	public String toString() {
		return "Waterfall [prodId=" + prodId + ", waterfallName=" + waterfallName + ", waterfallDescription="
				+ waterfallDescription + ", waterfallBrief=" + waterfallBrief + ", waterfallPath=" + waterfallPath
				+ ", waterfallAbout=" + waterfallAbout + ", waterfallAbout1=" + waterfallAbout1 + ", waterfallAbout2="
				+ waterfallAbout2 + ", waterfallPrice=" + waterfallPrice + ", waterfallPrice1=" + waterfallPrice1
				+ ", waterfallPrice2=" + waterfallPrice2 + "]";
	}
	
	
	
}
