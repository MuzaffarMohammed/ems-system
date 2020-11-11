package com.mh.ems.system.dao.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ems_user database table.
 * 
 */
@Entity
@Table(name="ems_user")
public class EmsUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmsUserPK id;

	public EmsUser() {
	}

	public EmsUserPK getId() {
		return this.id;
	}

	public void setId(EmsUserPK id) {
		this.id = id;
	}

}