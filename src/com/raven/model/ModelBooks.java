package com.raven.model;

import java.time.LocalDate;

import com.crjj.model.Books;
import com.raven.table.model.TableRowData;

public class ModelBooks extends TableRowData {
	Books book;
	int idBook;

	String title;

	String isbn;

	int pageCount;

	LocalDate publishedDate;

	String thumbnailUrl;
	String shortDescription;

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
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

	public ModelBooks() {
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public ModelBooks(Books book) {
		this.book = book;
		this.idBook = book.getIdBook();
		this.title = book.getTitle();
		this.isbn = book.getIsbn();
		this.pageCount = book.getPageCount();
		this.publishedDate = book.getPublishedDate();
		this.thumbnailUrl = book.getThumbnailUrl();
		this.shortDescription = book.getShortDescription();
	}

	@Override
	public Object[] toTableRow() {
		return new Object[] { isbn != null ? isbn : "", title != null ? title : "",
				pageCount != 0 ? Integer.toString(pageCount) : "",
				(publishedDate != null) ? publishedDate.toString() : "",
				shortDescription != null ? shortDescription : "", };
	}
}
