package com.mh.ems.system.dao.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ems_user database table.
 * 
 */
@Embeddable
public class EmsUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

	private String password;

	public EmsUserPK() {
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmsUserPK)) {
			return false;
		}
		EmsUserPK castOther = (EmsUserPK)other;
		return 
			(this.userId == castOther.userId)
			&& this.userName.equals(castOther.userName)
			&& this.password.equals(castOther.password);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.userName.hashCode();
		hash = hash * prime + this.password.hashCode();
		
		return hash;
	}
}