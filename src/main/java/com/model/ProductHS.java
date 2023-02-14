
package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductHS {
	
	@Id@GeneratedValue					
	private int prodId;
	
	@Column(name="prodName", length=30)			
	private String productName;
	private String productDescription;
	private String productPath;
	private String productBrief;
	private String productAbout;
	private String productAbout1;
	private String productAbout2;
	private String productPrice;
	private String productPrice1;
	private String productPrice2;
	public ProductHS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductHS(int prodId, String productName, String productDescription, String productPath, String productBrief,
			String productAbout, String productAbout1, String productAbout2, String productPrice, String productPrice1,
			String productPrice2) {
		super();
		this.prodId = prodId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPath = productPath;
		this.productBrief = productBrief;
		this.productAbout = productAbout;
		this.productAbout1 = productAbout1;
		this.productAbout2 = productAbout2;
		this.productPrice = productPrice;
		this.productPrice1 = productPrice1;
		this.productPrice2 = productPrice2;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductPath() {
		return productPath;
	}
	public void setProductPath(String productPath) {
		this.productPath = productPath;
	}
	public String getProductBrief() {
		return productBrief;
	}
	public void setProductBrief(String productBrief) {
		this.productBrief = productBrief;
	}
	public String getProductAbout() {
		return productAbout;
	}
	public void setProductAbout(String productAbout) {
		this.productAbout = productAbout;
	}
	public String getProductAbout1() {
		return productAbout1;
	}
	public void setProductAbout1(String productAbout1) {
		this.productAbout1 = productAbout1;
	}
	public String getProductAbout2() {
		return productAbout2;
	}
	public void setProductAbout2(String productAbout2) {
		this.productAbout2 = productAbout2;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductPrice1() {
		return productPrice1;
	}
	public void setProductPrice1(String productPrice1) {
		this.productPrice1 = productPrice1;
	}
	public String getProductPrice2() {
		return productPrice2;
	}
	public void setProductPrice2(String productPrice2) {
		this.productPrice2 = productPrice2;
	}
	@Override
	public String toString() {
		return "ProductHS [prodId=" + prodId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPath=" + productPath + ", productBrief=" + productBrief
				+ ", productAbout=" + productAbout + ", productAbout1=" + productAbout1 + ", productAbout2="
				+ productAbout2 + ", productPrice=" + productPrice + ", productPrice1=" + productPrice1
				+ ", productPrice2=" + productPrice2 + "]";
	}
	
	
	
}
	