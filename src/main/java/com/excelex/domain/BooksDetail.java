package com.excelex.domain;

public class BooksDetail {
	
	private int detailId;
	private String id;
	private String publish_date;
	private String bestSellerYn;
	
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public String getBestSellerYn() {
		return bestSellerYn;
	}
	public void setBestSellerYn(String bestSellerYn) {
		this.bestSellerYn = bestSellerYn;
	}
	@Override
	public String toString() {
		return "BooksDetail [detailId=" + detailId + ", id=" + id + ", publish_date=" + publish_date + ", bestSellerYn="
				+ bestSellerYn + "]";
	}
	
	
}