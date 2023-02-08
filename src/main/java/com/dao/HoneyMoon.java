package com.dao;

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
	public HoneyMoon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoneyMoon(int hmId, String destinationName, String destinationDescription, String destinationPath) {
		super();
		this.hmId = hmId;
		DestinationName = destinationName;
		DestinationDescription = destinationDescription;
		DestinationPath = destinationPath;
	}
	public int getHmId() {
		return hmId;
	}
	public void setHmId(int hmId) {
		this.hmId = hmId;
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
	@Override
	public String toString() {
		return "HoneyMoon [hmId=" + hmId + ", DestinationName=" + DestinationName + ", DestinationDescription="
				+ DestinationDescription + ", DestinationPath=" + DestinationPath + "]";
	}
	
	
}
