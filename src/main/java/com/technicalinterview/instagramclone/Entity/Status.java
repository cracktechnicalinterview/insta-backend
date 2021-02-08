package com.technicalinterview.instagramclone.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Status")
public class Status {

	@Id
	@GeneratedValue
	private int id;
	
	private String statusId;
	private String userId;
	private String path;
	private String userName;
	private Timestamp timeStamp;
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Status(int id, String statusId, String userId, String path, Timestamp timeStamp) {
		super();
		this.id = id;
		this.statusId = statusId;
		this.userId = userId;
		this.path = path;
		this.timeStamp = timeStamp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}	
}
