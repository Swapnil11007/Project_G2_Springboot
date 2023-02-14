package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HoneyMoon {

	
	@Id@GeneratedValue					
	private int hmId;
	
	@Column(name="DestinationName", length=30)			
	private String DestinationName;
	private String DestinationDescription;
	private String DestinationPath;
	private String DestinationBrief;
	private String DestinationAbout;
	private String DestinationAbout1;
	private String DestinationAbout2;
	private String DestinationPrice;
	private String DestinationPrice1;
	private String DestinationPrice2;

	public HoneyMoon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoneyMoon(int hmId, String destinationName, String destinationDescription, String destinationPath,
			String destinationBrief, String destinationAbout, String destinationAbout1, String destinationAbout2,
			String destinationPrice, String destinationPrice1, String destinationPrice2) {
		super();
		this.hmId = hmId;
		DestinationName = destinationName;
		DestinationDescription = destinationDescription;
		DestinationPath = destinationPath;
		DestinationBrief = destinationBrief;
		DestinationAbout = destinationAbout;
		DestinationAbout1 = destinationAbout1;
		DestinationAbout2 = destinationAbout2;
		DestinationPrice = destinationPrice;
		DestinationPrice1 = destinationPrice1;
		DestinationPrice2 = destinationPrice2;
	}

	public String getDestinationName() {
		return DestinationName;
	}

	public void setDestinationName(String destinationName) {
		DestinationName = destinationName;
	}

	public String getDestinationDescription() {
		return DestinationDescription;
	}

	public void setDestinationDescription(String destinationDescription) {
		DestinationDescription = destinationDescription;
	}

	public String getDestinationPath() {
		return DestinationPath;
	}

	public void setDestinationPath(String destinationPath) {
		DestinationPath = destinationPath;
	}

	public String getDestinationBrief() {
		return DestinationBrief;
	}
	public void setDestinationBrief(String destinationBrief) {
		DestinationBrief = destinationBrief;
	}
	public String getDestinationAbout() {
		return DestinationAbout;
	}
	public void setDestinationAbout(String destinationAbout) {
		DestinationAbout = destinationAbout;
	}
	public String getDestinationAbout1() {
		return DestinationAbout1;
	}
	public void setDestinationAbout1(String destinationAbout1) {
		DestinationAbout1 = destinationAbout1;
	}
	public String getDestinationAbout2() {
		return DestinationAbout2;
	}
	public void setDestinationAbout2(String destinationAbout2) {
		DestinationAbout2 = destinationAbout2;
	}
	public String getDestinationPrice() {
		return DestinationPrice;
	}
	public void setDestinationPrice(String destinationPrice) {
		DestinationPrice = destinationPrice;
	}
	public String getDestinationPrice1() {
		return DestinationPrice1;
	}
	public void setDestinationPrice1(String destinationPrice1) {
		DestinationPrice1 = destinationPrice1;
	}
	public String getDestinationPrice2() {
		return DestinationPrice2;
	}
	public void setDestinationPrice2(String destinationPrice2) {
		DestinationPrice2 = destinationPrice2;
	}


	public String getDestinationBrief() {
		return DestinationBrief;
	}

	public void setDestinationBrief(String destinationBrief) {
		DestinationBrief = destinationBrief;
	}

	public String getDestinationAbout() {
		return DestinationAbout;
	}

	public void setDestinationAbout(String destinationAbout) {
		DestinationAbout = destinationAbout;
	}

	public String getDestinationAbout1() {
		return DestinationAbout1;
	}

	public void setDestinationAbout1(String destinationAbout1) {
		DestinationAbout1 = destinationAbout1;
	}

	public String getDestinationAbout2() {
		return DestinationAbout2;
	}

	public void setDestinationAbout2(String destinationAbout2) {
		DestinationAbout2 = destinationAbout2;
	}

	public String getDestinationPrice() {
		return DestinationPrice;
	}

	public void setDestinationPrice(String destinationPrice) {
		DestinationPrice = destinationPrice;
	}

	public String getDestinationPrice1() {
		return DestinationPrice1;
	}

	public void setDestinationPrice1(String destinationPrice1) {
		DestinationPrice1 = destinationPrice1;
	}

	public String getDestinationPrice2() {
		return DestinationPrice2;
	}

	public void setDestinationPrice2(String destinationPrice2) {
		DestinationPrice2 = destinationPrice2;
	}

	public int getHmId() {
		return hmId;
	}


	@Override
	public String toString() {
		return "HoneyMoon [hmId=" + hmId + ", DestinationName=" + DestinationName + ", DestinationDescription="
				+ DestinationDescription + ", DestinationPath=" + DestinationPath + ", DestinationBrief="
				+ DestinationBrief + ", DestinationAbout=" + DestinationAbout + ", DestinationAbout1="
				+ DestinationAbout1 + ", DestinationAbout2=" + DestinationAbout2 + ", DestinationPrice="
				+ DestinationPrice + ", DestinationPrice1=" + DestinationPrice1 + ", DestinationPrice2="
				+ DestinationPrice2 + "]";
	}
	
	
}
