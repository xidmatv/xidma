package com.java.springboot.xidmatv.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
@Entity
@Table
public class Message {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column
	private String author;
	@Column
	private String body;
	@Column
	private LocalDateTime timeStamp;
	
	public Message () {}
	public Message (String autor,String body) {
		this.timeStamp = LocalDateTime.now();
		this.author = autor;
		this.body = body;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String autor) {
		this.author = autor;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
