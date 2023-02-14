package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Dashboard {
	@Id @GeneratedValue
	private int id;
	private String prodName;
	private String emailID;
	private String imgPath;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date travelDate;
	private int quantity;
	private int totalAmount;
	
	public Dashboard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dashboard(int id, String prodName, String emailID, String imgPath, Date travelDate, int quantity,
			int totalAmount) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.emailID = emailID;
		this.imgPath = imgPath;
		this.travelDate = travelDate;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Dashboard [id=" + id + ", prodName=" + prodName + ", emailID=" + emailID + ", imgPath=" + imgPath
				+ ", travelDate=" + travelDate + ", quantity=" + quantity + ", totalAmount=" + totalAmount + "]";
	}
	
	
}