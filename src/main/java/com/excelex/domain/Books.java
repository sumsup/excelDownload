package com.excelex.domain;

public class Books {
	
	private String id;
	private String name;
	private String writer;
	private int price;
	private String genre;
	private String publisher;
	private int cnt;
	private String saleDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}	
	public String getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", writer=" + writer + ", price=" + price + ", genre=" + genre
				+ ", publisher=" + publisher + ", cnt=" + cnt + "]";
	}
	
	
	
}
