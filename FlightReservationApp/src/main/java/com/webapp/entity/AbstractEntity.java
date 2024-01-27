package com.webapp.entity;

import javax.persistence.*;

@MappedSuperclass
public class AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
