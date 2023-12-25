package com.crjj.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser")
	int idUser;

	@Column(name = "username")
	String username;

	@Column(name = "nomUser")
	String nomUser;

	@Column(name = "prenomUser")
	String prenomUser;

	@Column(name = "password")
	String password;

	@Column(name = "emailUser")
	String emailUser;

	@Column(name = "isAdmin")
	boolean isAdmin;

	@Column(name = "createDate")
	LocalDate createDate;

	@Column(name = "modification_time")
	LocalDate modification_time;

	public int getIdUser() {
		return idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getModification_time() {
		return modification_time;
	}

	public void setModification_time(LocalDate modification_time) {
		this.modification_time = modification_time;
	}

	public User() {

	};

	public User(String username, String nomUser, String prenomUser, String password, String emailUser, boolean isAdmin,
			LocalDate createDate, LocalDate modification_time) {
		this.username = username;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.password = password;
		this.emailUser = emailUser;
		this.isAdmin = isAdmin;
		this.createDate = createDate;
		this.modification_time = modification_time;
	}
}
