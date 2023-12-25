package com.crjj.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "_id")
	 int idBook;

	@Column(name = "title")
	String title;

	@Column(name = "isbn")
	String isbn;

	@Column(name = "pageCount")
	int pageCount;

	@Column(name = "publishedDate")
	LocalDate publishedDate;

	@Column(name = "thumbnailUrl")
	String thumbnailUrl;

	@Column(name = "shortDescription")
	String shortDescription;

	public int getIdBook() {
		return idBook;
	}

	public Books(String title, String isbn, int pageCount, LocalDate publishedDate, String thumbnailUrl,
			String shortDescription, String status) {
		this.title = title;
		this.isbn = isbn;
		this.pageCount = pageCount;
		this.publishedDate = publishedDate;
		this.thumbnailUrl = thumbnailUrl;
		this.shortDescription = shortDescription;
		this.status = status;
	}

	public Books() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "status")
	public String status;
}
